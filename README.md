# *PermissionPlugin*
This is a simple plugin for **Minecraft 1.20.1** that enable the usage of a custom command only if the player that want to use it has the right **permission**.
## Requirements

To deploy this project you will need a few things:

- A **Bukkit/Spigot Minecraft 1.20.1 Test Server** (it can also be hosted in your machine);
- Donwload the **.jar file**.

**And that's it!**

If you dont have the server already, please follow this **tutorial**:
[SpigotServer](https://www.youtube.com/watch?v=B0CyGUDxkDI&list=PLfu_Bpi_zcDNEKmR82hnbv9UxQ16nUBF7&index=2&pp=iAQB)

## Installation

To use the mod, please follow this steps:

1. Make sure that you have the minimum **Requirements** to continue;

1. Insert the **.jar file** into the **plugin** folder of the minecraft server;

1. Execute the **start.bat** file (if you have one) or simply **start the server**.

1. Launch the **pl** (plugin) **command** in the terminal of the server: if the name of the plugin is in **green**, you are good to go.

1. **Join the server** and enjoy your plugin!

## Commands and Permissions

There is **1 custom command** (/test), and you can run it **only if you are OP in the server.** Being OP will also give you the **permission.commands.test permission**, given only to OP players. If you want to use the command **while not being OP**, you will need to configure in the [plugin.yml](https://github.com/GettingTren/PermissionPlugin/blob/main/permissionsplugin/plugin.yml), changing the **default: op** (line 13) under the permission.command.test tree to **not op**, then **recompile the .jar file** and implements it into the **server's plugin folder**.

## Help

**If you need help, message me on discord, link in the main page of [my account](https://github.com/GettingTren) ;)**

## Authors

- [@groggo](https://github.com/GettingTren)
