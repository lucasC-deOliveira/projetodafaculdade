package faculdade;
import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Deque;

public class No {

int valor;
 No noEsquerda, noDireita;
 int maisAlto;
 public No(int valor) {
 this.valor = valor;
 }
 
 public static No raiz;
 public static void inserir(int valor) {
 inserir(raiz, valor);
 }
 
 public static void inserir(No node, int valor) {
 if (node == null) {
 System.out.println("Raiz " + valor);
 raiz = new No(valor);
 } else {
 if (valor < node.valor) {
 if (node.noEsquerda != null) {
 inserir(node.noEsquerda, valor);
 } else {
 System.out.println("Inserindo " + valor + " a esquerda de" + node.valor);
 node.noEsquerda = new No(valor);
 }
 } else {
 if (node.noDireita != null) {
 inserir(node.noDireita, valor);
 } else {
 System.out.println("Inserindo " + valor + " a direita de" + node.valor);
 node.noDireita = new No(valor);
 }
 }
 }
 }
 public static void preordem(No node) {
 if (node != null) {
 System.out.print(node.valor + ", ");
 preordem(node.noEsquerda);
 preordem(node.noDireita);
 }
 }
 public static void posordem(No node) {
 if (node != null) {
 posordem(node.noEsquerda);
 posordem(node.noDireita);
 System.out.print(node.valor + ", ");
 }
 }
 public static void ordem(No node) {
 if (node != null) {
 ordem(node.noEsquerda);
 System.out.print(node.valor + ", ");
 ordem(node.noDireita);
 }
 }
 
 public static void nivel(No node) {
	 if(node == null) {
		 System.out.println("fila nao existe ");
	 }
	 else {
		 Deque<No> fila = new ArrayDeque<>();
		 fila.add(node);
		 while(!fila.isEmpty()) {
			 No atual = fila .removeFirst();
			 System.out.print(atual.valor + ",");
			 if(atual.noEsquerda != null ) {
				 fila.add(atual.noEsquerda);
				 
			 }
			 
			 if(atual.noDireita != null ) {
				 fila.add(atual.noDireita);
				 
			 }
			 
		 }
		 
	 }
 }


 public static void main(String[] args) {
 inserir(4);
 inserir(2);
 inserir(6);
 inserir(1);
 inserir(3);
 inserir(5);
 inserir(7);
 System.out.println("preordem");
preordem(raiz);
System.out.println();
System.out.println("ordem");
 ordem(raiz);
 System.out.println();
 System.out.println("posordem");
 posordem(raiz);
 System.out.println();
 System.out.println("nivel (largura)");
 nivel(raiz);

 }
}