# Makefile
run:
	./app/build/install/app/bin/app
check-style:
	./gradlew checkstyleMain
install:
	./gradlew installDist