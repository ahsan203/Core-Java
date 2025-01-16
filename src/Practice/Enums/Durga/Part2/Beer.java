package Practice.Enums.Durga.Part2;

public enum Beer
{
    KF,KO,RC,FO;
}

class Test {

    public enum aa {
        ash,ahs;
    }
    public static void main(String[] args) {

        Beer kf = Beer.KF;
        System.out.println(kf);
        //------Internally toString() will be called.
        enum aa {
            ash,ahs;
        }
    }
}


