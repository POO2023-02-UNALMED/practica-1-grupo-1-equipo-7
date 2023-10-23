package funcionalidades;

import java.util.*;
import gestorAplicación.*;

public class AtencionCliente {
	
	
	public static void main(String[] arg){
		
		System.out.println("------------Atencion al cliente------------");
		System.out.println("Bienvenid@ al sistema de atención al cliente.\n¿Qué desea realizar?");
		
		System.out.println("1. Sugerencia");
		System.out.println("2. Qujea");
		System.out.println("3. Reseña");
		System.out.println("4. Solicitar Devolucion");
		System.out.println("5. Salir");
		
		Scanner input4=new Scanner(System.in);
		int opcion4;
		opcion4=input4.nextInt();
		
		switch(opcion4) {
		
		case 1:
			System.out.println("------------Sugerencias------------");
			System.out.println("Ha seleccionado la opcion 1, Sugerencia, ¿Sobre que desea realizar su sugerecia?");
			
			System.out.println("1. Sobre el menu");
			System.out.println("2. Sobre un empleado");
			System.out.println("3. Sobre una de nuestras sedes");
			System.out.println("4. Algun otro");
			System.out.println("5. Salir");
			
			String type = null;			
			
			Scanner inputs=new Scanner(System.in);
			int opcions;
			opcions=inputs.nextInt();
			
			switch(opcions) {
			
			case 1:
				type = "Menu";
				
			case 2:
				type = "Empleado";
				
			case 3:
				type = "Sede";
			
			case 4:
				type = "otro";
			
			case 5:
					break;
			default:
				System.out.println("Opcion invalida");
			
			}
			if (opcions== 5) {break;}
			System.out.println("Por favor, a continuacion escriba su sugerencia");
			
			Scanner inputTextoS=new Scanner(System.in);
			String TextoS;
			TextoS=inputTextoS.nextLine();
			
			System.out.println("Todo listo");
			
			System.out.println("1. Editar Sugerencia");
			System.out.println("2. Enviar Sugerencia");
			
			Scanner inputOEditarS=new Scanner(System.in);
			int opcionES;
			opcionES=inputOEditarS.nextInt();
			
			if (opcionES == 1) {
				
				System.out.println("Ahora puede editar su sugerencia");
				Scanner inputEditarS=new Scanner(System.in);
				String EditarS;
				EditarS=inputEditarS.nextLine();
				
				TextoS = EditarS;
			}
			
			if (opcionES == 2) {new Sugerencia(type, TextoS);}
			
			System.out.println("Su sugerencia se ha enviado con exito");
			System.out.println("1. Salir");
			
			Scanner inputSalirS = new Scanner(System.in);
			int SalirS;
			SalirS=inputSalirS.nextInt();
			
			
			break;
		
			
			
		case 2:
			System.out.println("------------Quejas------------");
			System.out.println("Ha seleccionado la opcion 2, Quejas\nPor favor, a continuacion ingrese su nombre completo:");
			
			Scanner inputNombreQ=new Scanner(System.in);
			String NombreQ;
			NombreQ=inputNombreQ.nextLine();
			
			System.out.println("¿Sobre que desea realizar su queja?");
			
			System.out.println("1. Sobre el menu");
			System.out.println("2. Sobre un empleado");
			System.out.println("3. Sobre una de nuestras sedes");
			System.out.println("4. Algun otro");
			System.out.println("5. Salir");
			
			
			String typeQ = null;
			String OtroQ = null;
			
			Scanner inputQ=new Scanner(System.in);
			int opcionQ;
			opcionQ=inputQ.nextInt();
			
			switch(opcionQ) {
			
			case 1:
				typeQ = "Menu";
				
				System.out.println("¿Sobre que platillo desea quejarse?");
				
				Scanner inputplatoQ=new Scanner(System.in);
				String platoQ;
				Plato platoQueja;
				platoQ=inputplatoQ.nextLine();
				
				platoQueja = Plato.buscarPlato(platoQ);
				
				while (platoQueja == null) {
					System.out.println("Este platillo no existe. Por favor ingrese un platillo que se encuentre en el menu");
					
					System.out.println("1. Ingresar un platillo diferente");
					System.out.println("2. Salir");
					
					Scanner inputPQ = new Scanner(System.in);
					int opcionPQ;
					opcionPQ = inputPQ.nextInt();
					
					if (opcionPQ == 1) {
						Scanner inputplatoEQ=new Scanner(System.in);
						String platoEQ;
						platoEQ=inputplatoEQ.next();
						
						platoEQ = platoQ;
						
					}
					
					if(opcionPQ == 2) {
						break;
					}
				OtroQ = platoQ;
					
				}
				
			case 2:
				typeQ = "Empleado";
				
				System.out.println("Por favor, para continuar ingrese el nombre del empleado");
				
				Scanner inputempleadoQ=new Scanner(System.in);
				String empleadoQ;
				Empleado empleadoQueja;
				empleadoQ=inputempleadoQ.nextLine();
				
				empleadoQueja = Empleado.buscarEmpleadoXNombre(empleadoQ);
				
				while (empleadoQueja == null) {
					System.out.println("Esta persona no hace parte de nuestro equipo de trabjo. Por favor ingrese otro nombre");
					
					System.out.println("1. Ingresar un nombre diferente");
					System.out.println("2. Salir");
					
					Scanner inputEQ = new Scanner(System.in);
					int opcionEQ;
					opcionEQ = inputEQ.nextInt();
					
					if (opcionEQ == 1) {
						Scanner inputempleadoEQ=new Scanner(System.in);
						String empleadoEQ;
						empleadoEQ=inputempleadoEQ.next();
						
						empleadoEQ = empleadoQ;
						
					}
					
					if(opcionEQ == 2) {
						break;
					}
				OtroQ = empleadoQ;
					
				}
				
			case 3:
				typeQ = "Sede";
				
				System.out.println("Por favor, para continuar indique la sede de la cual quiere hacer su queja");

				Scanner inputsedeQ=new Scanner(System.in);
				String sedeQ;
				Restaurante sedeQueja;
				sedeQ=inputsedeQ.nextLine();
				
				sedeQueja = Restaurante.buscarSedeXUbicacion(sedeQ);
				
				while (sedeQueja == null) {
					System.out.println("Esta Sede no existe. Por favor ingrese una sede valida");
					
					System.out.println("1. Ingresar una sede diferente");
					System.out.println("2. Salir");
					
					Scanner inputSQ = new Scanner(System.in);
					int opcionSQ;
					opcionSQ = inputSQ.nextInt();
					
					if (opcionSQ == 1) {
						Scanner inputsedeEQ=new Scanner(System.in);
						String sedeEQ;
						sedeEQ=inputsedeEQ.nextLine();
						
						sedeEQ = sedeQ;
					}
					
					if(opcionSQ == 2) {
						break;
					}
					
				OtroQ = sedeQ;
				}
			
			case 4:
				typeQ = "Algun otro";
				
				
				OtroQ = null;
			
			case 5:
					break;
			default:
				System.out.println("Opcion invalida");
			}
			if (opcionQ == 5) {break;}
		
		
			System.out.println("Por favor, a continuacion escriba su queja");
			
			Scanner inputTextoQ=new Scanner(System.in);
			String TextoQ;
			TextoQ=inputTextoQ.nextLine();
			
			System.out.println("Todo listo");
			
			System.out.println("1. Editar Queja");
			System.out.println("2. Enviar Queja");
			
			Scanner inputOEditarQ=new Scanner(System.in);
			int opcionEQ;
			opcionEQ=inputOEditarQ.nextInt();
			
			if (opcionEQ == 1) {
				
				System.out.println("Ahora puede editar su sugerencia");
				Scanner inputEditarQ=new Scanner(System.in);
				String EditarQ;
				EditarQ=inputEditarQ.nextLine();
				
				TextoQ = EditarQ;
			}
			
			if (opcionEQ == 2) {new Queja(NombreQ, typeQ, OtroQ, TextoQ);}
			
			System.out.println("Su queja se ha enviado con exito");
			System.out.println("1. Salir");
			
			Scanner inputSalirQ = new Scanner(System.in);
			int SalirQ;
			SalirQ=inputSalirQ.nextInt();
			
			break;
			
			
		
		case 3:
			System.out.println("------------Reseñas------------");
			System.out.println("Ha seleccionado la opcion 3, Reseña.\n¿Que desea realizar?");
			
			System.out.println("1. Ver repositorio de reseñas");
			System.out.println("2. Realizar una nueva reseña");
			System.out.println("3. Salir");
			
			Scanner inputR=new Scanner(System.in);
			int opcionR;
			opcionR=inputR.nextInt();
			
			
			
			switch(opcionR) {
			
			case 1:
				System.out.println("Mostrando recopilatorio de reseñas ...");
				
				for(Reseña rsñ: Reseña.Recopilatorio) {
					System.out.println(rsñ);
					System.out.println("\n");
				}
				
				break;
				
				
			case 2:
				
				System.out.println("¿Desea que su reseña sea anonima?");
				System.out.println("1. Si");
				System.out.println("2. No");
				
				String NombreR=null;
				int nombreR;
				Scanner inputNombreR = new Scanner(System.in);
				nombreR = inputNombreR.nextInt();
				
				if (nombreR == 1) {
					NombreR = "Anonimo";
					
				}
				
				if(nombreR == 2) {
					System.out.println("Por favor, a continuacion ingrese su nombre:");
					String newNombre=null;
					Scanner inputNNombre = new Scanner(System.in);
					newNombre = inputNNombre.nextLine();
					
					NombreR = newNombre;
					
			
				}
				
				System.out.println("Por favor, escriba su reseña");
				
				String reseñaN= null;
				Scanner inputrsñ = new Scanner(System.in);
				reseñaN=inputrsñ.nextLine();
				
				
				System.out.println("Por favor, indique del 1-5 que calificación le daria a su experiencia en el restaurante, donde 1 es mul mal y 5 muy bien");
				
				int cant;
				Scanner inputcant = new Scanner(System.in);
				cant = inputcant.nextInt();	
				
				System.out.println("Todo listo");
				
				System.out.println("1. Editar Reseña");
				System.out.println("2. Enviar Reseña");
				
				Scanner inputOEditarR=new Scanner(System.in);
				int opcionER;
				opcionER=inputOEditarR.nextInt();
				
				if (opcionER == 1) {
					
					System.out.println("Ahora puede editar su Reseña");
					Scanner inputEditarR=new Scanner(System.in);
					String EditarR;
					EditarR=inputEditarR.nextLine();
					
					reseñaN = EditarR;
					
					System.out.println("¿Tambien quiere editar su calificación?");
					System.out.println("1. Si");
					System.out.println("2. No");
					
					int ec;
					Scanner inputec=new Scanner(System.in);
					ec = inputec.nextInt();
					
					if (ec == 1) {
						int cant2;
						Scanner inputcant2=new Scanner(System.in);
						cant2 = inputcant2.nextInt();
						
						cant = cant2;
					}
				}
				
				if (opcionER == 2) {new Reseña(NombreR, reseñaN, cant) ;}
				
				System.out.println("Su reseña se ha enviado con exito");
				System.out.println("1. Salir");
				System.out.println("2. Ver repositorio de reseñas");
				
				int finR;
				Scanner inputfinR = new Scanner(System.in);
				finR = inputfinR.nextInt();
				
				if (finR ==1) {break;}
				
				if (finR ==2) {
					System.out.println("Mostrando recopilatorio de reseñas");
					
					for(Reseña rsña: Reseña.Recopilatorio) {
						System.out.println(rsña);
						System.out.println("\n");
					}
				
				}
				break;
				
				
			case 3: break;
			
			default:
				System.out.println("Opcion invalida");
			
			}
			break;
			
			
			
			
		
		case 4:
			break;
			
			
		case 5:
			break;
			
		default:
			System.out.println("Opcion invalida");
		}
		
	}

}
