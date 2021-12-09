package one.digitalinnovation;

import java.util.LinkedList;
import java.util.Queue;


// Queue fila ( FIFO ) -> First inn First out
public class MainQueue
{

    public static void main( String[] args )
    {
        Queue<Carro> queueCarros = new LinkedList<>( );

        // Tenta adicionar mas se não conseguir vai dar erro
        queueCarros.add( new Carro( "Ford") );
        queueCarros.add( new Carro( "Chevrlet") );
        queueCarros.add( new Carro( "Fiat") );

        System.out.println( queueCarros.add( new Carro( "Peugeot" ) ) );
        System.out.println( queueCarros );

        // Método parecido com o add mas se não conseguir adicionar retorna false;
        System.out.println( queueCarros.offer( new Carro( "Renault" ) ) );
        System.out.println( queueCarros );

        // Exibe o primeiro item da fila
        System.out.println( queueCarros.peek( ) );
        System.out.println( queueCarros );

        // Retira o primeiro item da fila
        System.out.println( queueCarros.poll( ) );
        System.out.println( queueCarros );

        System.out.println( queueCarros.isEmpty( ) );
        System.out.println( queueCarros.size( ) );
        queueCarros.clear( );
        System.out.println( queueCarros.isEmpty( ) );
    }
}
