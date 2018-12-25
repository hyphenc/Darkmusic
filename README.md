# DarkPhonograph
[![License: GPL v3](https://img.shields.io/badge/License-GPL%20v3-blue.svg)](https://github.com/hyphenc/DarkPhonograph/blob/master/LICENSE.txt)

**A Phonograph fork with stylistic modifications, namely a dark player interface.**

You can find the changes I made by searching (Ctrl+Shift+F) for "// ~" in Android Studio, and see what I changed.

All of this could probably be done a lot cleaner (etc.), but it works™

## Additional Styling ##
Heads up!
If you do not use "Card Layout", remove the three <view... items under the comment in the file DarkPhonograph/app/src/main/res/layout/fragment_player_album_cover.xml, to remove the gradients on the album cover.
I added those to make the notification icons visible again on white-ish covers when using the Card layout.

I recommend these settings:
```
Colors>General theme>Black (AMOLED)
Colors>Primary color>Custom>#000000 (->black) //should be set by default
Colors>Accent color>Custom>#FFFFFF  (->white) //should be set by default
```
I also recommed having just one library tab, for example "Playlists", because when you have only one library tab, the tab view will be hidden.

## Screenshots ##
<img src="./art/player.png" alt="player" width="200"/> <img src="./art/playlist-view.png" alt="playlist view" width="200"/> <img src="./art/sidebar.png" alt="sidebar" width="200"/> <img src="./art/tag-editor.png" alt="tag editor" width="200"/>

