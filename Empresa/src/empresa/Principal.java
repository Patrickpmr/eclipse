package empresa;

public class Principal {

	public static void main(String[] args) {
		Aluno a = new Aluno();
		a.matricula=1001;
		a.cpf="252522222";
		a.nome="trick";
		
		Aluno b = new Aluno();
		b.matricula=1005;
		b.cpf="884555999";
		b.nome="pedro";
		
		/*System.out.println("Matricula:"+ a.matricula);
		System.out.println("cpf:"+ a.cpf);
		System.out.println("nome:" + a.nome);
		System.out.println();*/
		
		a.info();
		
		a.nome="Patrick medeiros";
		
		a.info();
		/*System.out.println("Matricula:"+ a.matricula);
		System.out.println("cpf:"+ a.cpf);
		System.out.println("nome:" + a.nome);
		System.out.println();*/
		// TODO Auto-generated method stub
		
		b.info();
		
		Carro.PI=70;

	}

}
