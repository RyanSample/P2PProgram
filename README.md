P2PProgram
==========

P2P program that will allow users to transfer and receive files from an ip address. Users will receive a pop up
notifying them of the incoming files. The message will contain a description of the file, size, etc. The client has
the ability to reject incoming files. Future work will include max number of files that can be sent without accepting,
ability to block an IP, stuff like that.

Note for devs:
The source is going to modular
Each module will be able to substituted for a different module built around some sort of future API
This will allow future changes and features to be added in a much easier manner
Modules such as the Crypto module can be changed to implement better code.

Current Modules to be implemented:
-Comms(for sending and receiving socket messages)
-Compression(compress the files to be sent out to the client)
-Crypto(generate secure keys and protocols between a pair of clients)
-Window(GUI enough said)


DISCLAIMER:
This code is in no way a secure working product. I do not take responsibility for any damages or losses resulting from
you the user/developer attempting to use this program. Furthermore, I in no way promote nor take responsibility for 
you, the user, using this program to distribute copywritten material in illegal manners. I, the owner of this written
code take no responsibility for other peoples misuse of this program. 
TL;DR: Don't blame me for illegal copies/sharing of copywritten work brought about by a different user's use of this
code.
