const Discord = require('discord.js');

const bot = new Discord.Client();
const channelID = "553068115748061184"
bot.on("ready", () => {
    bot.channels.cache.get(channelID).send("I'm awake");
    console.log("ready");
})


bot.login("Nzc1NTEyNjQxOTk2NzE4MTAw.X6nabg.2oKrR63is9bs1mmXVEvNFShSukE");