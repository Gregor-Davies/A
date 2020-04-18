package me.steam.chatreader;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class ChatReader extends  JavaPlugin implements Listener{

    @Override
    public void onEnable(){
        getServer().getPluginManager().registerEvents(this, this);
        if(!getConfig().contains("words")){
            List<String> words = new ArrayList<String>();
            words.add("shit");
            words.add("arse");
            words.add("ass");
            words.add("asshole");
            words.add("arsehole");
            words.add("bastard");
            words.add("bitch");
            words.add("bollocks");
            words.add("child-fucker");
            words.add("Christ on a bike");
            words.add("christ on cracker");
            words.add("crap");
            words.add("cunt");
            words.add("damn");
            words.add("frigger");
            words.add("fuck");
            words.add("goddamn");
            words.add("godsdamn");
            words.add("hell");
            words.add("holy shit");
            words.add("horseshit");
            words.add("jesus christ");
            words.add("jesus fuck");
            words.add("jesus H. christ");
            words.add("jesus harold christ");
            words.add("jesus wept");
            words.add("jesus, mary and joseph");
            words.add("judas priest");
            words.add("motherfucker");
            words.add("nigga");
            words.add("nigger");
            words.add("prick");
            words.add("shit ass");
            words.add("shitass");
            words.add("slut");
            words.add("son of bitch");
            words.add("son of motherless goat");
            words.add("son of a whore");
            words.add("sweet jesus");
            words.add("twat");
            words.add("cracker");
            getConfig().swt("words", words);

        }
        saveConfig();
    }

    @EventHandler
    public void onPlayerChat(AysncPlayerChatEvent e){
       String msg =  e.getMessage();
       List<String> words = getConfig().getStringList("words");
       for(int i = 0; i < words.size(); i++){
           if(message.contains(words.get(i))){
               e.setCancelled(true);
               e.getPlayer().sendMessage("&cThis server does not allow you to swear, if you think this word is not a swear word contact a server adminstrator");
           }
       }
    }
}
