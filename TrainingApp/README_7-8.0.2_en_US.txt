NOTE: Contains Patch02
TrainingApp8-General-7-8.0.2_en_US

TrainingApp8-General-7-8.0.2_en_US has the following features:
1) Shortcuts in the TrainingApp directory
- There are shortcuts to start TrainingApp (with and without the debugger enabled) and stop TrainingApp.
- There is a shortcut to start Guidewire Studio.
2) logging.properties
- The TrainingApp logs are stored in c:\Guidewire\TrainingApp\logs.
- This ensures the log files are contained within the TrainingApp directory.
3) Generated files
- Data Dictionary and Security Dictionary 
- Gosu reference
- java-api directory
- soap-api directory
4) Database of TrainingApp original data
- A "dbbackup" directory has a copy of the database as it exists at the start of the course.
- From the command line for the bind directort, execute the gwta dev-dropdb
- Copy the content of the "dbbackup" folder to the "db" folder.
5) IntelliJ IDEA (Guidewire Studio) original settings
- The ".idea - Copy" folder contains the original files for Guidewire Studio settings.
- When Guidewire Studio is closed, first delete the contents of the ".idea" folder.
- Then copy the contents of the ".idea - Copy" folder.
6) Base.zip
- Contains TrainingApp version of:
-- config
-- deploy
-- etc
-- gsrc
-- plugins
-- sampledata
-- target
-- webresources
-- xsd
-- configuraton.iml
-- pom.xml
-- product.properties

