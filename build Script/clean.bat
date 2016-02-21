rmdir /s /q C:\xampp\htdocs\STEM-TUTOR-STUDENT
mkdir C:\xampp\htdocs\STEM-TUTOR-STUDENT
net use O: \\172.16.230.219\C$ /user:Administrator Gannon123 
xcopy "C:\Program Files (x86)\Jenkins\jobs\demo\workspace" O:\xampp\htdocs\STEM-TUTOR-STUDENT /s /e /y /h 
