// https://docs.oracle.com/en/java/javase/20/docs/api/java.base/java/util/Random.html
import java.util.Random;
import java.util.*; 


public class PedraPapelTesoura {
	
	static final int PEDRA = 0;
	static final int PAPEL = 1;
	static final int TESOURA = 2;
 
	static public void main(String[] args){
		System.out.println("Vamos jogar Pedra, Papel, Tesoura!");
		int jogadaUsuario = recebeJogadaUsuario();
		int jogadaCpu = geraJogadaCpu();
		int resultado = executaJogada(jogadaUsuario, jogadaCpu);
		exibeResultado(jogadaUsuario, jogadaCpu, resultado);
	}
	
	static public int recebeJogadaUsuario(){

		Scanner sc= new Scanner(System.in);

        //completar
		return sc.nextInt();

		
	}
	
	static public int geraJogadaCpu(){
		Random rnd = new Random();
		long semente = System.currentTimeMillis();
		rnd.setSeed(semente);
		return rnd.nextInt(3); // retorna aleatorio entre 0 e 2
	}
	
	static public int executaJogada(int jogadaUsuario, int jogadaCpu){
				
		if(jogadaUsuario == PEDRA && jogadaCpu == PAPEL){
			return jogadaCpu;

		} else if(jogadaUsuario == PAPEL && jogadaCpu == PEDRA){
			return jogadaUsuario;
		} else if(jogadaUsuario == PAPEL && jogadaCpu == TESOURA){
			return jogadaCpu;
		} else if(jogadaUsuario == PEDRA && jogadaCpu == TESOURA){
			return jogadaUsuario;
		} else if(jogadaUsuario == TESOURA && jogadaCpu == PAPEL){
			return jogadaUsuario;
		} else if(jogadaUsuario == TESOURA && jogadaCpu == PEDRA){
			return jogadaUsuario;
		} else{
			return -1;
		}

        // completar
	}
	
	static public void exibeResultado(int jogadaUsuario, int jogadaCpu, int resultado){
		//completar
			//System.out.println("isso aí" +jogadaUsuario);
		if(resultado == -1){
			System.out.println("empate");
		} else if(jogadaUsuario == resultado){
			System.out.println("vitoria do Usuario");
		} else{
			System.out.println("Vitoria da CPU");
		}
	}
	
}