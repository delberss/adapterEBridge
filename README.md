# Utilização do padrão de projeto Adapter e Bridge

Padrão Bridge:

Onde está sendo usado?

    O padrão Bridge é utilizado na relação entre a classe abstrata Dispositivo e a interface ModoOperacao.

Por que foi usado?

    O objetivo do padrão Bridge é desacoplar uma abstração de sua implementação, de modo que ambas possam variar independentemente. No nosso exemplo:
        A abstração é o Dispositivo (como TV ou Rádio).
        A implementação é o ModoOperacao (como Ligado, Desligado ou ModoEconomico).

Ao usar o padrão Bridge, podemos facilmente adicionar novos dispositivos ou novos modos de operação sem alterar o código existente. Por exemplo, podemos adicionar um novo dispositivo como "Computador" ou um novo modo de operação como "ModoSilencioso" sem afetar as classes existentes.
Padrão Adapter:

Onde está sendo usado?

    O padrão Adapter é utilizado na relação entre a classe abstrata Dispositivo e a interface IControle.

Por que foi usado?

    O objetivo do padrão Adapter é permitir que duas interfaces incompatíveis trabalhem juntas. No nosso exemplo:
        Temos diferentes interfaces de controle, como ControleRemotoPadrao e ControlePorVoz.
        Queremos que nossos dispositivos (TV, Rádio) possam ser controlados por qualquer uma dessas interfaces, mesmo que originalmente não tenham sido projetados para isso.

Ao usar o padrão Adapter, podemos facilmente adaptar diferentes interfaces de controle para trabalhar com nossos dispositivos. Por exemplo, se no futuro criarmos um novo tipo de controle, como "ControleGestual", podemos criar um adaptador para ele e fazer com que funcione com os dispositivos existentes sem alterar o código deles.
Combinação dos Padrões:

Ao combinar os padrões Adapter e Bridge, conseguimos uma arquitetura flexível onde:

    Podemos adicionar novos dispositivos ou modos de operação de forma independente (graças ao Bridge).
    Podemos introduzir novas interfaces de controle e fazê-las funcionar com dispositivos existentes (graças ao Adapter).

No nosso exemplo, um Dispositivo (TV ou Rádio) pode operar em diferentes ModosOperacao (Ligado, Desligado, ModoEconomico) e ser controlado por diferentes interfaces (ControleRemotoPadrao, ControlePorVoz). A combinação desses padrões nos dá a flexibilidade de expandir e adaptar nosso sistema conforme necessário.


Padrão Bridge:

Onde está sendo usado?

    Quando você define o modo de operação para um dispositivo usando definirModo(), você está usando o padrão Bridge.

Exemplos no caso de teste:

    tv.definirModo(new Ligado()); - Aqui, você está definindo o modo de operação da TV para "Ligado". A TV (abstração) está sendo desacoplada de sua implementação de modo de operação (Ligado).
    radio.definirModo(new ModoEconomico()); - Aqui, você está definindo o modo de operação do Rádio para "ModoEconomico". O Rádio (abstração) está sendo desacoplado de sua implementação de modo de operação (ModoEconomico).

Padrão Adapter:

Onde está sendo usado?

    Quando você cria um dispositivo e passa uma interface de controle como argumento para o construtor, você está usando o padrão Adapter.

Exemplos no caso de teste:

    new TV(new ControleRemotoPadrao()); - Aqui, você está criando uma TV e adaptando-a para ser controlada por um ControleRemotoPadrao.
    new Radio(new ControlePorVoz()); - Aqui, você está criando um Rádio e adaptando-o para ser controlado por um ControlePorVoz.

Ambos os padrões estão presentes e são evidentes nos casos de teste. O padrão Bridge permite que os dispositivos tenham diferentes modos de operação, enquanto o padrão Adapter permite que os dispositivos sejam controlados por diferentes interfaces de controle.