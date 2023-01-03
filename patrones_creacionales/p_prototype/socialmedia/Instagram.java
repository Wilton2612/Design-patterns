package patrones_creacionales.p_prototype.socialmedia;

import java.util.Objects;

public class Instagram extends SocialMedia{
    
    public String QR;

    public Instagram(){


    }
    public Instagram(Instagram instagram){

        super(instagram);
        if (instagram != null)
        {
            this.QR = instagram.QR;
        }
    }

    @Override
    public SocialMedia clone()
    {
        return new Instagram(this);
    }


    @Override
    public boolean equals(Object objeto){
        if (!(objeto instanceof Instagram) || !super.equals(objeto)) return false;
        Instagram social = (Instagram) objeto;
        return Objects.equals(social.QR, QR);
    }

}
