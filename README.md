# Geyser-like Starter Wrapper (Template)

**Usage**
1. Fork/clone this repo.
2. Put the Geyser jar (or Geyser-Spigot connector jar) into `libs/` (or add proper Maven dependency).
3. Build with Maven: `mvn clean package`.
4. Put resulting plugin jar into your Paper/Spigot server `plugins/`.
5. Start server — plugin will check for Geyser library and print next steps in console.

**Notes**
- This repository **does NOT** implement protocol translation. It is a starter wrapper to help you integrate or test Geyser components inside a Spigot plugin.
- For full functionality, see: GeyserMC (open-source project).
