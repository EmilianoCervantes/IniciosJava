package edu.itesm.mx.proyecto;
import javax.swing.*;
import twitter4j.conf.*;
import twitter4j.*;
import javax.swing.*;
import twitter4j.conf.*;
import twitter4j.*;
import java.util.List;
import java.awt.*;
import java.awt.event.*;

public class Twitter<T> extends JFrame{
	private JButton consulta;
	private twitter4j.Twitter twitter;
	public Twitter(){
		super("Twitter");
	}
	public CircularDoubleLinkedList consultaTwitter(String con){
		configuraTwitter();
		CircularDoubleLinkedList c = new CircularDoubleLinkedList();
		try {
			Query query = new Query(con);
			QueryResult result;
			int i=0;
			result = twitter.search(query);
			List<Status> tweets = result.getTweets();
			for (Status tweet : tweets) {
				c.addLast(tweet.getText());
			}
			i++;
		} catch (Exception te) {
			te.printStackTrace();
			System.out.println("Failed to search tweets: " + te.getMessage());
		}
		return c;
	}
	
	public DefaultListModel consultaTwitter(String con, DefaultListModel m){
		configuraTwitter();
		try {
			Query query = new Query(con);
			QueryResult result;
			do{
				result = twitter.search(query);

				List<Status> tweets = result.getTweets();

				for (Status tweet : tweets) {
					String cambio="@" + tweet.getUser().getScreenName() + " - " + tweet.getText();
					m.addElement(cambio);
				}

			} while((query = result.nextQuery()) != null);
		}catch (Exception te) {
			te.printStackTrace();
			System.out.println("Failed to search tweets: " + te.getMessage());
		}
		return m;
	}
	
	public void configuraTwitter(){
		ConfigurationBuilder cb = new ConfigurationBuilder();
		cb.setDebugEnabled(true)
		.setOAuthConsumerKey("1p5P7csT4JVytA8PJVKQs0FrC")
		.setOAuthConsumerSecret("8S40bMHM7VMUwAVKzsI4FJ6oR6uAyI3DG1j5KUCauOViz4ohP9")
		.setOAuthAccessToken("432589386-hyjl6HqdwovriVhT3km9vB3VwDlD4gwglzQsO7V6")
		.setOAuthAccessTokenSecret("R7XbArvVyI4skEud6HLT52r4g9aXr3FABsZNeMMI6tSuC");
		TwitterFactory tf = new TwitterFactory(cb.build());
		twitter = tf.getInstance();
	}
}