import javax.swing.*;
import twitter4j.conf.*;
import twitter4j.*;
import java.util.List;
import java.awt.*;
import java.awt.event.*;

public class DemoTwitter extends JFrame{


	private JButton consulta;
	private Twitter twitter;
	
	public DemoTwitter(){
		super("Demo DemoTwitter");
		setSize(800, 600);
		setVisible(true);
		consulta = new JButton("Consulta a Twitter");

		configuraTwitter();

		consulta.addActionListener(new ActionListener()
			{
			  public void actionPerformed(ActionEvent e)
			  {
			  	String s = JOptionPane.showInputDialog(null, "Dame tu consulta");
			  	consultaTwitter(s);
			   
			  }
			});

		 JPanel addPanel = new JPanel();
		 addPanel.add(consulta);
		 add(addPanel, BorderLayout.NORTH);

		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}


public void consultaTwitter(String con){
	        try {
            Query query = new Query(con);
            QueryResult result;
            do {
                result = twitter.search(query);
                List<Status> tweets = result.getTweets();
                for (Status tweet : tweets) {
                    System.out.println("@" + tweet.getUser().getScreenName() + " - " + tweet.getText());
                }
            } while ((query = result.nextQuery()) != null);
            System.exit(0);
        } catch (Exception te) {
            te.printStackTrace();
            System.out.println("Failed to search tweets: " + te.getMessage());
        }
}

	public void configuraTwitter(){
		ConfigurationBuilder cb = new ConfigurationBuilder();
	cb.setDebugEnabled(true)
  .setOAuthConsumerKey("QYtvCScBLH0ZYdbBC9dVJsbw7")
  .setOAuthConsumerSecret("0eb6kmnE6gR16ZTcGQMSDBCNJyUFCzDPcTABC6fK9zSuUWqGDN")
  .setOAuthAccessToken("41387638-0pubNqust6sqimkcTPcy4jSaiA4lkhKgd2HQY0avi")
  .setOAuthAccessTokenSecret("mxAGPW1Z4san5RgAt4aQ9G1kFWLh2T4d9kNoKvP8L0uwa");
		TwitterFactory tf = new TwitterFactory(cb.build());
		 twitter = tf.getInstance();
	}
	public static void main(String args[]){
			DemoTwitter demo = new DemoTwitter();


	}	

}