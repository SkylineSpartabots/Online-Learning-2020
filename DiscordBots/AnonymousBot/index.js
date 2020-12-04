const Discord = require('discord.js');
const bot = new Discord.Client();
const questionChannelID = "779532072364277822";
const botID = "777783771646787606"

bot.on('ready', () => {
    console.log("bot is ready");
})
// !ask
bot.on('message', (message) => {
    if (message.channel.type == "dm" && message.author.id != botID) {
        if (message.content.toLowerCase().startsWith("!ask ")) {
            let question = message.content.substr(4, message.content.length)
            bot.channels.cache.get(questionChannelID).send(question);
        } else {
            message.channel.send("Ask a question with the command ```!ask <question>```");
        }
    }
})

bot.login("Nzc3NzgzNzcxNjQ2Nzg3NjA2.X7IdlQ.R6OgQiIelYu--odiU5O8_9ZcwCc");