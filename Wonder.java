class wonders {
    void location() {
        System.out.println("Location is:");
    }

    void famousfor() {
        System.out.println("Famous for:\n");
    }

}

class Colosseum extends wonders {
    void location() {
        System.out.println("Colosseum is in Rome, Italy");
    }

    void famousfor() {
        System.out.println("It is Famous for oval amphitheater\n");
    }
}

class China extends wonders {
    void location() {
        System.out.println("The Great Wall of China is in china");
    }

    void famousfor() {
        System.out.println("It is Famous for The Great Wall of China\n");
    }
}

class TajMahal extends wonders {
    void location() {
        System.out.println("Taj Mahal is in India");
    }

    void famousfor() {
        System.out.println("It is Famous for stunning white marble mausoleum\n");
    }
}

class Redeemer extends wonders {
    void location() {
        System.out.println("Redeemer is in Brazil");
    }

    void famousfor() {
        System.out.println("It is Famous since it is 30 meters tall\n");
    }
}

class MachuPicchu extends wonders {
    void location() {
        System.out.println("Machu Picchu is in Peru");
    }

    void famousfor() {
        System.out.println("It is Famous for lost treasure of the 15th century\n");
    }
}

class ChichenItza extends wonders {
    void location() {
        System.out.println("ChichenItza is in Mayan");
    }

    void famousfor() {
        System.out.println("It is Famous fro series of monuments and temples\n");
    }
}

class Petra extends wonders {
    void location() {
        System.out.println("Petra is in Jordan");
    }

    void famousfor() {
        System.out.println("It is Famous for golden hue\n");
    }
}

class Wonder {
    public static void main(String args[]) {
        wonders A = new wonders();
        wonders M = new Colosseum();

        wonders Mu = new China();

        wonders G = new TajMahal();

        wonders C = new Redeemer();

        wonders D = new MachuPicchu();

        wonders E = new ChichenItza();
        wonders F = new Petra();
        A.location();
        A.famousfor();

        M.location();
        M.famousfor();

        Mu.location();
        Mu.famousfor();

        G.location();
        G.famousfor();

        C.location();
        C.famousfor();

        D.location();
        D.famousfor();

        E.location();
        E.famousfor();

        F.location();
        F.famousfor();
    }
}