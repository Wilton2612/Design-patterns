package patrones_creacionales.p_prototype.socialmedia;

import java.util.Objects;

public abstract class SocialMedia {

    public String name;
    public String color;

    public SocialMedia()
    {

    }

    public SocialMedia(SocialMedia social)
    {
        if (social  != null)
        {
            this.name = social.name;
            this.color= social.color;
        }
    }

    public abstract SocialMedia clone();

    @Override
    public boolean equals(Object objeto)
    {

        if (!(objeto instanceof SocialMedia)) return false;
        SocialMedia social2 = (SocialMedia) objeto;
        return Objects.equals(social2.name, name) && Objects.equals(social2.color, color);
        
    }
}
