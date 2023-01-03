package patrones_creacionales.p_prototype.socialmedia;

public class Facebook extends SocialMedia{
    
    public boolean shareContent;

    public Facebook(){

    }


    public Facebook(Facebook facebook){

        super(facebook);
        if (facebook != null){
            this.shareContent = facebook.shareContent;
        }
    }

    @Override
    public SocialMedia clone(){
        return new Facebook(this);
    }

    @Override
    public boolean equals(Object objeto){

        if (!(objeto instanceof Facebook) || !super.equals(objeto)) return false;
        Facebook social = (Facebook) objeto;
        return social.shareContent == shareContent;
    }


    
}
