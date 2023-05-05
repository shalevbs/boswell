/*
    Npc Name: Shalon
    Npc ID: 9270038
    Location Name: Changi Airport
    Location ID: 540010000
            
    @Author: Connor
    @Created: 2023-04-12 
*/

def ret = script.askYesNo("Hello, I am Shalon from Singapore Airport. I can assist you in getting you to Kerning City " +
        "in no time. Do you want to go to Kerning City?\r\n\r\n The trip costs #b10000 Mesos#k")

if (ret == 1) {
    if (user.getMeso() < 10000) {
        script.say("Hmm.. Are you sure that you have #b10000 Mesos#k? Check your Inventory and make sure you have enough. " +
                "You must pay the fee or I can't let you aboard.")
    } else {
        user.gainMeso(-10000)
        user.changeMap(103000000, 4)
    }
} else {
    script.say("Okay, talk to me if you change your mind!")
}