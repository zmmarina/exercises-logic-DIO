package exercises2;

public class PeopleMatrix {
    String[][] people = {{"João", "São Paulo", "(11)9999-4952"},
            {"Maria", "Ribeirão Preto", "(16)9999-8596"},
            {"Ana", "Manaus", "(92)9999-8574"}};

        for(int i = 0; i < people.length; i++){
        System.out.println(people[i][0] + " lives in " + people[i][1] + " - number: " + people[i][2]);
    }
}
