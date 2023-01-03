package patrones_creacionales.p_prototype;

import java.util.ArrayList;
import java.util.List;

import patrones_creacionales.p_prototype.socialmedia.Facebook;
import patrones_creacionales.p_prototype.socialmedia.Instagram;
import patrones_creacionales.p_prototype.socialmedia.SocialMedia;

public class Demo {
    
    public static void main(String[] args){

        List<SocialMedia> socialMedia = new ArrayList<>();
        List<SocialMedia> socialMediaCopy = new ArrayList<>();

        Instagram instagram = new Instagram();
        instagram.name = "Instagram";
        instagram.color = "Red";
        instagram.QR = "3djsje38asi3393";

        socialMedia.add(instagram);

        Instagram copyInstagram = (Instagram) instagram.clone();
        socialMedia.add(copyInstagram);


        Facebook facebook = new Facebook();
        facebook.name = "Facebook";
        facebook.color = "Blue";
        facebook.shareContent = true;
        
        socialMedia.add(facebook);

        compare(socialMedia, socialMediaCopy);
    }

    private static void compare(List<SocialMedia> socialMedia, List<SocialMedia> socialMediaCopy ) {
            
        for (SocialMedia social : socialMedia) {

            System.out.println(social.color );
            System.out.println(social.name);
            socialMediaCopy.add(social.clone());
            
        }

        System.out.println(socialMedia.toString() );
        System.out.println(socialMediaCopy.toString());
        
        

        for (int i = 0; i < socialMedia.size(); i++) {
            
            System.out.println(socialMedia.get(i).color );
            System.out.println(socialMedia.get(i).name);
            System.out.println("####################################" );
            System.out.println(socialMediaCopy.get(i).color );
            System.out.println(socialMediaCopy.get(i).name);
            
            if (socialMedia.get(i) != socialMediaCopy.get(i))
            {
                System.out.println(i + ": Son objetos diferentes");
                if (socialMedia.get(i).equals(socialMediaCopy.get(i)))
                {
                    System.out.println(i + ": Los objetos son identicos");
                }
                else{
                    System.out.println(i + ": Los objetos no son identicos");
                }
            }
            else
            {
                System.out.println(i + ": Los objetos son iguales");
            }
        }

    }
}
