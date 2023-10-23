package funcionalidades;
import gestorAplicación.*;
import java.util.*;
import gestorAplicación.*;

public class AtencionCliente {
	
	

	static{
	          
		new Reseña("Anonimo", "Gran lugar para pasar el tiempo en familia, muy buena la atención", 4);
		new Reseña("Julian Vargas", "Me gustaron los pozoles", 5);
		new Reseña("Marta Wayne", "La comida estaba fria y tardaron mucho en atendernos, mal ahí", 2);
		new Reseña("Barbara Gordon", "Muy buen servicio a domicilio, todo llego a tiempo y recien hecho", 5);
		new Reseña("Anonimo", "Que fea la sede de Bello, casi nos roban al salir", 1);
		new Reseña("Anonimo", "Mi mujer se enfermo despues de comer en una de sus sedes", 1);
		new Reseña("Carol Diaz", "Excelente atención", 5);
		new Reseña("Santiago Lopez", "Muy buenas porciones y de sabor delicioso", 5);
		new Reseña("Esteban Tabares", "La atención en el local de las Americas fue muy buena, hicimos un evento familiar y todo salio perfecto", 5);
		new Reseña("Elizabeth Bennet", "La tortilla estaba dura pero lo demas muy rico", 3);
		
	}
	

	
	
	public static List<Reseña> Recopilatorio2 = Reseña.Recopilatorio;
	public static List<Devolucion> ListaDevoluciones2 = Devolucion.ListaDevoluciones;
	
	public static void main(String[] arg){
		
		System.out.println("------------Atencion al cliente------------");
		System.out.println("Bienvenid@ al sistema de atención al cliente.\n¿Qué desea realizar?");
		
		System.out.println("1. Sugerencia");
		System.out.println("2. Queja");
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
			if (opcions != 5 && opcions>= 1) {
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
			}
			
			break;
		
			
			
		case 2:
			System.out.println("------------Quejas------------");
			System.out.println("Ha seleccionado la opcion 2, Quejas\nPor favor, a continuacion ingrese su nombre completo:");
			
			Scanner inputNombreQ = new Scanner(System.in);
			String NombreQ;
			NombreQ = inputNombreQ.nextLine();
			
			System.out.println("¿Sobre que desea realizar su queja?");
			
			System.out.println("1. Sobre el menu");
			System.out.println("2. Sobre un empleado");
			System.out.println("3. Sobre una de nuestras sedes");
			System.out.println("4. Algun otro");
			System.out.println("5. Salir");
			
			
			String typeQ = null;
			String OtroQ = null;
			
			Scanner inputQ = new Scanner(System.in);
			int opcionQ;
			opcionQ = inputQ.nextInt();
			
			switch(opcionQ) {
			
			case 1:
				typeQ = "Menu";
				
				System.out.println("¿Sobre que platillo desea quejarse?");
				
				Scanner inputplatoQ = new Scanner(System.in);
				String platoQ;

				Plato platoQueja;
				platoQ = inputplatoQ.nextLine();

				boolean pb;

				
				platoQ = inputplatoQ.nextLine();
				pb =Plato.existePlato(((String)platoQ));
				System.out.println(Plato.existePlato(platoQ));
				
				
				if (pb == false) {
					System.out.println("Este platillo no es parte de nuestro menu");
					
					opcionQ = 5;
					
					break;
					
					
				}	
				
				
				break;
				
			case 2:
				typeQ = "Empleado";
				
				System.out.println("Por favor, para continuar ingrese el nombre del empleado");
				
				Scanner inputempleadoQ=new Scanner(System.in);
				String empleadoQ;
				boolean empleadoQueja;
				empleadoQ=inputempleadoQ.nextLine();
				
				empleadoQueja = Empleado.existeEmpleado(empleadoQ);
				if(empleadoQueja == false) {
					System.out.println("Esta persona no pertenece a nuestro equipo de trabajo");
					
					opcionQ = 5;
					
					break;
				}
				
				OtroQ = empleadoQ;
				break;
				
			case 3:
				typeQ = "Sede";
				
				System.out.println("Por favor, para continuar indique la sede de la cual quiere hacer su queja");
				
				System.out.println("1. Sede Las Americas");
		        System.out.println("2. Sede Sandiego");
		        System.out.println("3. Sede Envigado");
		        System.out.println("4. Sede Belen");
		        
				Scanner inputsedeQ=new Scanner(System.in);
				int sedeQ;
				Restaurante sedeQueja;
				sedeQ=inputsedeQ.nextInt();
				
				switch (sedeQ) {
				
				case 1:
					OtroQ = "Sede Las Americas";
					break;
					
				case 2:
					OtroQ = "Sede Sandiego";
					break;
					
				case 3:
					OtroQ = "Sede Envigado";
					break;
					
				case 4:
					OtroQ = "Sede Belen";
					break;
				
				default:
					System.out.println("Esta Sede no existe");
					opcionQ = 5;
					break;
					
				}
				
				break;
			
			case 4:
				typeQ = "Algun otro";
				
				
				OtroQ = null;
				break;
			
			case 5:
					System.out.println("Usted ha salido con exito");
					break;
			default:
				System.out.println("Opcion invalida");
				opcionQ = 5;
				break;
			}
			
			if (opcionQ == 5) {break;}
		
			if (opcionQ != 5 && opcionQ >= 1) {
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
					
					System.out.println("Ahora puede editar su queja");
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
			}
				
			break;
			
			
		
		case 3:
			System.out.println("------------Reseñas------------");
			System.out.println("Ha seleccionado la opcion 3, Reseña.\n¿Que desea realizar?");
			
			System.out.println("1. Ver repositorio de reseñas");
			System.out.println("2. Realizar una nueva reseña");
			System.out.println("3. Salir");
			
			Reseña reseñaNueva = null;
			Scanner inputR=new Scanner(System.in);
			int opcionR;
			opcionR=inputR.nextInt();
			
			
			
			switch(opcionR) {
			
			case 1:
				System.out.println("Mostrando recopilatorio de reseñas ...");
				
				for(Reseña rsñ: Recopilatorio2) {
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
				if (opcionER == 2) {reseñaNueva = new Reseña(NombreR, reseñaN, cant);}
				Recopilatorio2.add(reseñaNueva);
				
				System.out.println("Su reseña se ha enviado con exito");
				System.out.println("1. Salir");
				System.out.println("2. Ver repositorio de reseñas");
				
				int finR;
				Scanner inputfinR = new Scanner(System.in);
				finR = inputfinR.nextInt();
				
				if (finR ==1) {break;}
				
				if (finR ==2) {
					System.out.println("Mostrando recopilatorio de reseñas");
					
					for(Reseña rsña: Recopilatorio2) {
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
			System.out.println("------------Devoluciones------------");
			System.out.println("Ha seleccionado la opcion 4, Devoluciones.\n¿Que desea realizar?");
			
			System.out.println("1. Ver las solicitudes de Devoluciones");
			System.out.println("2. Realizar una nueva solicitud");
			System.out.println("3. Revisar el estado de mi solicitud");
			System.out.println("4. Salir");
			
	
			Scanner inputD=new Scanner(System.in);
			int opcionD;
			opcionD=inputD.nextInt();
			
			switch(opcionD) {
			case 1:  //Ver solicitudes de Devoluciones
				System.out.println("Para poder continuar debe ingresar su codigo de empleado. ¿Cuenta con un codigo de empleado?");
				System.out.println("1. Si");
				System.out.println("2. No");
				
				Scanner inputD1=new Scanner(System.in);
				int opcionD1;
				opcionD1=inputD1.nextInt();
				
				switch (opcionD1) {
				case 1: //Tiene codigo de empleado
					System.out.println("Ingrese su codigo de empleado:");
					
					Scanner inputD12=new Scanner(System.in);
					Empleado emp;
					int opcionD12;
					opcionD12=inputD12.nextInt();
					
					emp = Empleado.buscarEmpleado(opcionD12);
					
					System.out.println("Bienvenid@ " + emp.getNombre()+ "\nA continucion se mostraran todas las solicitudes pendientes");
					
					for(Devolucion d: ListaDevoluciones2) {
						System.out.println(d);
						System.out.println("\n");
					}
					
					System.out.println("¿Desea revisar y cambiar el estado de una solucitud?");
					
					System.out.println("1. Si");
					System.out.println("2. No/Salir");
					
					Scanner i = new Scanner(System.in);
					int j;
					j = i.nextInt();
					
					if (j == 2) {break;}
					if (j == 1) {
						
						System.out.println("Por favor ingrese el numero de la solicitud que desea revisar");
						
						Scanner num = new Scanner(System.in);
						int n;
						n = num.nextInt();
						
						System.out.println("¿Desea aprobar o denegar la solicitud?");
						
						System.out.println("1. Aprobar");
						System.out.println("2. Denegar");
						
						
						int m;
						Scanner mun = new Scanner(System.in);
						m = mun.nextInt();
						
						//Denegar
						if (m == 2)  {
							
							System.out.println("Para poder denegar la solicitud por favor indique la razon: ");
							Scanner text = new Scanner(System.in);
							String t;
							t = text.nextLine();
							
							Devolucion delv;
							delv = Devolucion.buscarD2(ListaDevoluciones2, n);
							
							delv.setT(t);
							delv.setEstado("Denegado");
							
							System.out.println("Todo listo, la solicitud fue denegada con exito\n");
							System.out.println(delv);
							System.out.println("\nSaliendo");
							break;
							
						}
						
						//Aprobar
						if (m == 1) {
							
							Devolucion delv;
							delv = Devolucion.buscarD2(ListaDevoluciones2, n);
							
							delv.setEstado("Aprobado");
							System.out.println("Todo listo, la solicitud fue aprobada con exito\n");
							System.out.println(delv);
							System.out.println("\nSaliendo");
							break;
							
						}
						
						
						
						
					}
					
					
					
					break;
					
				case 2: //No tiene codigo de empleado
					break;
				}
				
				if(opcionD1 == 1) {
					
					
				}
				
				
				
				break;
			
			case 2:
				break;
				
			case 3:
				break;
			
			case 4:
				break;
				
			default:
				System.out.println("Opcion invalida");
				break;
			}
			
			break;
			
			
		case 5:
			break;
			
		default:
			System.out.println("Opcion invalida");
		}
		
	}

}
