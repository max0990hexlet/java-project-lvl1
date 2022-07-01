# Makefile
run-dist:
	./build/install/app/bin/app
check-style:
	./gradlew checkstyleMain
install:
	./gradlew installDist