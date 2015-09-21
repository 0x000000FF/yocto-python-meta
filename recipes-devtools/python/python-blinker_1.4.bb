DESCRIPTION = "Fast, simple object-to-object and broadcast signaling."
HOMEPAGE = "https://pypi.python.org/pypi/blinker"
SECTION = "devel/python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8baf1d53a00de619f60052e4752a89af"

PR = "r0"
SRCNAME = "blinker"

SRC_URI = "https://pypi.python.org/packages/source/b/${SRCNAME}/${SRCNAME}-${PV}.tar.gz"

SRC_URI[md5sum] = "378670fe456957eb3c27ddaef60b2b24"
SRC_URI[sha256sum] = "4c83829ff83d408b5e1d4995472265411d2c414112298f2eb4b359d9e4563373"

S = "${WORKDIR}/${SRCNAME}-${PV}"

inherit setuptools

