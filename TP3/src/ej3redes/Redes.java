package ej3redes;

public class Redes {

	public static void main(String[] args) {
		
		Red red1, red2, red3;
		Router r1, r2;
		Host h11, h12, h21, h22, h31, h32;
		//CREAMOS LAS REDES
		red1 = new Red(new Direccion(192,0));
		red2 = new Red(new Direccion(128,0));
		red3 = new Red(new Direccion(10,0));
		//CREAMOS LOS HOSTS
		h11 = new Host(new Direccion(192,1));
		h12 = new Host(new Direccion(192,2));
		h21 = new Host(new Direccion(128,1));
		h22 = new Host(new Direccion(128,2));
		h31 = new Host(new Direccion(10,1));
		h32 = new Host(new Direccion(10,2));
		//CONECTAMOS LOS HOST A LAS REDES
		red1.conctar(h11);	h11.conectar(red1);
		red1.conctar(h12);	h12.conectar(red1);
		red2.conctar(h21);	h21.conectar(red2);
		red2.conctar(h22);	h22.conectar(red2);
		red3.conctar(h31);	h31.conectar(red3);
		red3.conctar(h32);	h32.conectar(red3);
		//CREAMOS LOS ROUTERS
		r1 = new Router(new Direccion(172,0),3);
		r2 = new Router(new Direccion(225,0),3);
		//CONECTAMOS LOS ROUTERS Y LAS REDES
		r1.conectar(red1);	red1.conctar(r1);
		r1.conectar(red2);	red2.conctar(r1);
		r1.conectar(r2);	red3.conctar(r2);
		r2.conectar(red3);
		r2.conectar(r1);
		
		//MUESTA DE HOSTS
		System.out.println(h11);
		System.out.println(h12);
		System.out.println(h21);
		System.out.println(h22);
		System.out.println(h31);
		System.out.println(h32);
		//MUESTRA DE REDES
		System.out.println(red1);
		System.out.println(red2);
		System.out.println(red3);
		//MUESTRA DE ROUTERS
		System.out.println(r1);
		System.out.println(r2);
	}
}
