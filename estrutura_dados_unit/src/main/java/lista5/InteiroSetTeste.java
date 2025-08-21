package lista5;
public class InteiroSetTeste{
    public static void main(String[] args) {
        InteiroSet set1 = new InteiroSet();
        InteiroSet set2 = new InteiroSet();

        set1.addElem(5);
        set1.addElem(6);
        set1.addElem(9);

        set2.addElem(9);
        set2.addElem(6);
        set2.addElem(5);
        set2.addElem(12);
        set2.addElem(25);

        System.out.println("Conjunto A: " + set1.toString());
        System.out.println("Conjunto B: " + set2.toString());
        System.out.println("-----------------------");
        System.out.println("União: " + set1.union((set2)));
        System.out.println("Interseção: " + set1.intersection(set2));
        System.out.println("-----------------------");
        System.out.println("Iguais?: " + set1.isEqualTo(set2));
        set2.removeElem(12);
        System.out.println("Elemento 12 removido da lista B");
        set2.removeElem((25));
        System.out.println("Elemento 25 removido da lista B");
        System.out.println("Elemento 9 adicionado a lista A");
        set2.addElem(9);
        System.out.println("Iguais?: " + set1.isEqualTo(set2));

    }

}