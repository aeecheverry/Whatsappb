package com.stfalcon.chatkit.sample.common.data.fixtures;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.UUID;

/*
 * Created by Anton Bevza on 1/13/17.
 */
abstract class FixturesData {

    static SecureRandom rnd = new SecureRandom();

    static ArrayList<String> avatars = new ArrayList<String>() {
        {
            add("https://www.winhelponline.com/blog/wp-content/uploads/2017/12/user.png");
            add("https://www.winhelponline.com/blog/wp-content/uploads/2017/12/user.png");
            add("https://www.winhelponline.com/blog/wp-content/uploads/2017/12/user.png");
            add("https://www.winhelponline.com/blog/wp-content/uploads/2017/12/user.png");
        }
    };

    static final ArrayList<String> names = new ArrayList<String>() {
        {
            add("Andrés Echeverry");
            add("Daniel Bielos");
            add("Rafael Rueda");
            add("Andrés Rueda");
            add("Luis Garcia");
            add("Elvis Pressley");
            add("Elvis");
            add("Jonathan David");
            add("Johan");
            add("Jordan");
            add("Jordy ELN");
        }
    };

    static final ArrayList<String> messages = new ArrayList<String>() {
        {
            add("Hola");
            add("Como estás");
            add("Este es el mejor chat del mundo");
            add("Si seño open open open open sssssssssssssssssssssss");
            add("No hay problema te lo tengo listo para mañana");
            add("Entre mas largo sea el mensaje mejor brothe chcate esta");
            add("Información inportante ojo con editarme me refiero a fixture data soy sensible y deben tener cuidado o hago explotar todo");
            add("By by");
            add("Singula me dicen");
            add("El avatar pro master incomming winter");
            add("Jajajaja");
        }
    };

    static String getRandomId() {
        return Long.toString(UUID.randomUUID().getLeastSignificantBits());
    }

    static String getRandomAvatar() {
        return avatars.get(rnd.nextInt(avatars.size()));
    }

    static String getRandomName() {
        return names.get(rnd.nextInt(names.size()));
    }

    static String getRandomMessage() {
        return messages.get(rnd.nextInt(messages.size()));
    }

    static String getRandomImage() {
        return null;
    }

    static boolean getRandomBoolean() {
        return rnd.nextBoolean();
    }
}
