package Inheritance;

class Alpha {

    Alpha() {

        System.out.println("Parents Class Argumented Constrcuctor");
    }
}

class Beta extends Alpha {

}

class Gamma extends Beta {

    Gamma() {

        System.out.println("Grand Child ");
    }

}

class ExeCutor {

    public static void main(String[] args) {

        new Gamma();
    }
}
