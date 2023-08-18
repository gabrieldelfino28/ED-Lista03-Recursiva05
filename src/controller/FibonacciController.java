package controller;

public class FibonacciController {

    public FibonacciController() {
        // TODO Auto-generated constructor stub
        super();
    }

    public int FuncFib(int N) {

        if (N == 0) {
            return 0;
        }
		/*
			A condição de parada -> Quando N for igual a 1 ou 2, ele retorna 1, encerrando a
			pilha de chamadas da função recursiva.
			E quando N for 0, informado pelo usuário, ele retornara 0 direto.
		 */

        if (N == 1 || N == 2) {
            return 1;
        }

        return FuncFib(N - 1) + FuncFib(N - 2);
    }
	/*
		O fibonacci de forma recursiva é um pouco complexo, já que envolve
		o retorno de uma chamada dupla da mesma função, onde na primeira chamada N vai
		dimunuíndo por 1 a cada chamada, e é somado a segunda chamada onde
		N vai diminuíndo por 2 a cada nova chamada.

		Desse forma, a função recebe N informado pelo usuário como parâmetro,
		e realiza a somatória das duas chamadas intercaladas, criando assim
		um pilha complexa de chamada de funções na memória, até que N em ambas
		chamadas chegue a 1 ou 2, então ele chega na sua condição de parada,
		encerra a pilha e retorna o resultado desejado: o N'nésimo termo.
	 */
}
