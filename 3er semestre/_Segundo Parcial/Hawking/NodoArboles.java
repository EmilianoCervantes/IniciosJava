public class NodoArboles<T> implements Comparable<T>{

        private T dato;
        private NodoArboles<T> izquierdo;
        private NodoArboles<T> derecho;

        public NodoArboles( T dato){
                this.dato = dato;
                izquierdo = derecho = null;
        }

        public NodoArboles<T> getIzquierdo() {
                return izquierdo;
        }

        public void setIzquierdo(NodoArboles<T> izquierdo) {
                this.izquierdo = izquierdo;
        }

        public NodoArboles<T> getDerecho() {
                return derecho;
        }
        public void setDerecho(NodoArboles<T> derecho) {
                this.derecho = derecho;
        }

        public T getDato() {
                return dato;
        }
        public void setDato(T dato) {
                this.dato = dato;
        }

        @Override
        public int compareTo(T o) {
                // TODO Auto-generated method stub
                return ((Comparable)o).compareTo(dato);
        }


}
