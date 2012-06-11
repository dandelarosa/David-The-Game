FLEXDIR = ~/Applications/flex_sdk
all:
	$(FLEXDIR)/bin/mxmlc src/Main.as -output Main.swf -source-path FlashPunk -static-link-runtime-shared-libraries=true
