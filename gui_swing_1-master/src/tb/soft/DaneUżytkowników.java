package tb.soft;

import java.util.HashMap;

public class DaneUżytkowników extends HashMap{

    HashMap<String,String> daneUżytkowników;

    public DaneUżytkowników()
    {
        daneUżytkowników = ustawienieDanychUżytkowników();
    }

    private HashMap<String,String> ustawienieDanychUżytkowników()
    {
        HashMap<String,String> NoweDane = new HashMap<>();

        //kluczem jest login
        NoweDane.put("nowylogin1","hasło1");
        NoweDane.put("nowylogin2","hasło2");
        NoweDane.put("nowylogin3","hasło3");
        NoweDane.put("nowylogin4","hasło4");
        NoweDane.put("nowylogin5","hasło5");
        NoweDane.put("nowylogin6","hasło6");
        NoweDane.put("nowylogin7","hasło7");
        NoweDane.put("nowylogin8","hasło8");

        return NoweDane;
    }
}
