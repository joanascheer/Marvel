package br.com.zup.marvel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import br.com.zup.marvel.adapter.AdapterPersonagem
import br.com.zup.marvel.databinding.ActivityMainBinding
import br.com.zup.marvel.model.Personagem

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding =ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recyclerViewPersonagens.layoutManager = LinearLayoutManager(this)
        binding.recyclerViewPersonagens.setHasFixedSize(true)

        //config adapter
        val listaPersonagens: MutableList<Personagem> = mutableListOf()
        val adapterPersonagem = AdapterPersonagem(this, listaPersonagens)
        binding.recyclerViewPersonagens.adapter = adapterPersonagem

        criaLista(listaPersonagens)

    }

    private fun criaLista(listaPersonagens: MutableList<Personagem>) {
        val personagem1 = Personagem(
            R.drawable.ciclope,
            nomePersonagem = "Ciclope",
            descricao = "Scott Summers, mais conhecido por, Ciclope (Cyclops em inglês) é um personagem americano pertencente ao Universo Marvel Comics. Líder da equipe conhecida como X-Men, foi criado por Stan Lee e Jack Kirby, sua estreia nos quadrinhos foi em Uncanny X-Men #1 (1963). Seu poder é emitir raios energéticos pelos olhos, que normalmente tem efeito concussivo, mas já foram escritos como cortantes como laser. A emissão intermitente dos raios força Ciclope a barrá-los com óculos especiais com lentes de quartzo."
        )
        val personagem2 = Personagem(
            R.drawable.dr_estranho,
            nomePersonagem = "Dr Estranho",
            descricao = "O doutor Stephen Vincent Strange, mais conhecido como Doutor Estranho, é um super-herói que aparece nos quadrinhos publicados pela Marvel Comics. Criado pelo desenhista Steve Ditko e pelo roteirista Stan Lee,[1] o personagem apareceu pela primeira vez em Strange Tales #110 (julho de 1963). O Doutor Estranho serve como o Mago Supremo, o principal protetor da Terra contra ameaças mágicas e místicas. Inspirado por histórias de magia negra e o programa de rádio Chandu, the Magician,[2] Strange foi criado durante a Era de Prata das histórias em quadrinhos e trouxe temas de misticismo para a Marvel Comics."
        )
        val personagem3 = Personagem(
            R.drawable.hulk,
            nomePersonagem = "Hulk",
            descricao = "O Hulk, por vezes referido como O Incrível Hulk (The Incredible Hulk, no original em inglês), é um personagem de quadrinhos/banda desenhada do gênero super-herói, propriedade da Marvel Comics, editora pela qual as histórias do personagem são publicadas desde sua criação, na década de 1960. Concebido pelo roteirista Stan Lee (1922–2018) e pelo desenhista Jack Kirby (1917–1994), o Hulk teve sua primeira aparição junto ao público original dos Estados Unidos na revista The Incredible Hulk n°1, lançada no mercado americano pela Marvel Comics em maio de 1962, um título solo do personagem, garantindo-lhe o acesso ao que mais tarde seria popularmente conhecido como Universo Marvel dos quadrinhos/banda desenhada. A partir de então, o Hulk tem aparecido, protagonizando ou não, diversas histórias da editora, se tornando um dos mais visualmente reconhecíveis da mesma, tendo o universo entorno do personagem se expandido continuadamente ao longo das últimas décadas."
        )
        val personagem4 = Personagem(
            R.drawable.homem_de_ferro,
            nomePersonagem = "Homem de Ferro",
            descricao = "O Homem de Ferro (Iron Man) foi um personagem dos quadrinhos publicados pela Marvel Comics. Sua verdadeira identidade é o empresário e bilionário Tony Stark, que usou armaduras de alta tecnologia no combate ao crime. Foi criado em 1963 pelo escritor Stan Lee, o roteirista Larry Lieber e os desenhistas Jack Kirby e Don Heck. Stan Lee aceitou o desafio de fazer um personagem ser odiado e depois amado pelo público, criando um dos super-heróis mais marcantes de todos os tempos."
        )
        val personagem5 = Personagem(
            R.drawable.loki,
            nomePersonagem = "Loki",
            descricao = "Loki foi o vilão responsável pela primeira reunião dos Vingadores, grupo de super-heróis formado pelo seu arqui-inimigo e irmão adotivo Thor, Homem de Ferro, Viúva Negra, Gavião Arqueiro, Capitão América e Hulk. O grupo se formou após combater um dos ataques do vilão. Loki também foi o responsável pela criação do Homem-Absorvente[1] e pelos ataques do Destruidor, um robô criado por Odin, ambos inimigos de Thor. Entre tantas maldades que foi capaz de cometer com o intuito de usurpar o trono de Odin (que, por direito, é de Thor), Loki fez parte da Cabala de Norman Osborn[2], posteriormente incitando o Cerco a Asgard.[3] Seu fim aconteceu nas mãos do super-humano Vácuo, alter-ego demoníaco de Robert Reynolds (que chegou a fazer parte dos Vingadores sob a identidade heroica do Sentinela). Mas, na Era Heroica, foi ressuscitado em sua forma adolescente."
        )
        val personagem6 = Personagem(
            R.drawable.mulher_invisivel,
            nomePersonagem = "Mulher Invisível",
            descricao = "A Mulher Invisível, alter-ego de Susan \"Sue\" Richards, é uma super-heroína de histórias em quadrinhos da editora Marvel Comics. Quando foi criada e durante vários anos chamou-se Garota Invisível. No filme do Quarteto Fantástico de 2005 foi interpretada por Jessica Alba e no de 2015, por Kate Mara. Como namorada e posteriormente esposa de Reed Richards e irmã de Johnny Storm, foi fundamental em persuadir o piloto Ben Grimm a unir-se a eles numa perigosa missão espacial, que acabou por expô-los a quantidades enormes de radiação cosmica. Como consequência, ganharam poderes superhumanos. Susan obteve a habilidade de tornar-se invisível. Infelizmente, este poder sozinho provou ser relativamente de pouco uso em suas missões, especialmente em comparação às habilidades mais agressivas do resto do grupo. Mais tarde seus criadores, Stan Lee e Jack Kirby, desenvolveram um pouco mais os dons da Mulher Invisível."
        )
        val personagem7 = Personagem(
            R.drawable.pietro,
            nomePersonagem = "Pietro Maximoff",
            descricao = "Pietro nasceu em Wundagore na base do Alto Evolucionário, ele e sua irmã gêmea Wanda eram os filhos do casal Cigano Django e Marya Maximoff. O Alto Evolucionário supostamente sequestrou os gêmeos quando eram bebês e realizou experiência com eles, mas quando ele ficou repugnado com os resultados, ele os devolveu a Wundagore, disfarçados como mutantes normais."
        )
        val personagem8 = Personagem(
            R.drawable.thor,
            nomePersonagem = "Thor",
            descricao = "Thor é um personagem fictício que aparece nas histórias em quadrinhos, publicadas pela Marvel Comics, baseadas no deus Thor da Mitologia Nórdica, ele foi criado por Stan Lee e Jack Kirby. Sua principal arma é o martelo Mjonir. Estreando na Era de Prata dos quadrinhos, o personagem apareceu pela primeira vez em Journey into Mystery #83 (agosto de 1962). Ele é um membro fundador da equipe de heróis Vingadores."
        )
        val personagem9 = Personagem(
            R.drawable.vampira,
            nomePersonagem = "Vampira",
            descricao = "Os pais de Vampira, Owen e Priscilla, se casaram cedo após começarem um relacionamento e viviam em uma comunidade hippie em Caldecott County, no Mississippi. Nascida como Anna Marie, ela também gostava da atenção de sua tia Carrie. A tentativa falha da comunidade de usar o misticismo Nativo Americano para alcançar os Bancos Distantes resultou no desaparecimento de Priscila. Carrie assumiu os cuidados de Anna e, em luto pela perda de sua irmã, foi uma guardiã rigorosa e autoritária. Anna Marie era uma criança rebelde e seu relacionamento igualmente péssimo com seu pai a levou a fugir de casa quando era adolescente."
        )
        val personagem10 = Personagem(
            R.drawable.wolverine,
            nomePersonagem = "Volwerine",
            descricao = "James Howlett nasceu de uma família canadense rica no final do século XIX, sendo filho da Sra. Elizabeth Howlett e o marido empregado de Thomas Logan. Ele foi forçado a abandonar sua família após o trágico assassinato de seu pai, uma situação que fez com que suas habilidades bestiais mutantes do acelerado fator de cura, aguçadas pelos sentidos e garras ósseas em cada mão se manifestassem. Adotando o nome Logan, ele vagou pelo mundo, vivendo uma longa vida cheia de sangue, guerra e traição,[71] tendo o vil Dentes-De-Sabre como seu arqui-inimigo[72] e o guerreiro japonês Ogun como seu sensei.[73] Infelizmente, ao agir sempre como um lobo solitário, Logan foi um sujeito involuntário do Programa Arma X e teve seus ossos revestidos em indestrutível Adamantium, tornando-se um bem ainda mais letal.[74] Ele foi resgatado e assistido por Mac e Heather Hudson, juntando-se ao Departamento H como um operacional do governo canadense conhecido como o Wolverine."
        )

        listaPersonagens.add(personagem1)
        listaPersonagens.add(personagem2)
        listaPersonagens.add(personagem3)
        listaPersonagens.add(personagem4)
        listaPersonagens.add(personagem5)
        listaPersonagens.add(personagem6)
        listaPersonagens.add(personagem7)
        listaPersonagens.add(personagem8)
        listaPersonagens.add(personagem9)
        listaPersonagens.add(personagem10)

    }
}