# Multi Window Example

![Screenshot of splitscreen mode](img/splitscreen.png?raw=true "A screenshot of the splitscreen mode")

![Screenshot of freeform mode](img/freeform.png?raw=true "A screenshot of the freeform mode")

This repository contains a basic example of the new multi window features added in the Android N Preview.

##Splitscreen Mode
To put an app in splitscreen mode, first launch the app, then either long press on the overview button, or press on the overview button and long press and drag the app to the highlighted areas on the screen.

##Freeform Mode
To put an app in freeform mode, first launch the app, then press the freeform button to the right of the close button which should fade in. 
![Screenshot of overview](img/overview.png?raw=true "A screenshot of the overview menu")

If you don't see this button, make sure you have freeform mode enabled.

To enable freeform on an emulator, open up a command prompt and enter the following commands:

1. `$ adb shell`
2. `$ su`
3. `# setenforce 0`
4. `# settings put global enable_freeform_suppor 1`
5. `# mkdir /data/local/tmp/permissions && cd $_`
6. `# cp -a /system/etc/permissions/* .`
7. `# sed -e “s/live_wallpaper/freeform_window_management/” android.software.live_wallpaper.xml >freeform.xml`
8. `# mount --bind . /system/etc/permissions`
9. `# stop`
10. `# start`
