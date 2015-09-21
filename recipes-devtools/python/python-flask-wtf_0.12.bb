DESCRIPTION = "Simple integration of Flask and WTForms"
HOMEPAGE = "https://pypi.python.org/pypi/Flask"
SECTION = "devel/python"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=507e8635f25a06dc4f041a3a1b3359b3"

PR = "r0"
SRCNAME = "Flask-WTF"

SRC_URI = "https://pypi.python.org/packages/source/F/${SRCNAME}/${SRCNAME}-${PV}.tar.gz"

SRC_URI[md5sum] = "c53a74e8ba481bf53405fd5efdf0339e"
SRC_URI[sha256sum] = "bd99316c97ed1d1cb90b8f0c242c86420a891a6a2058f20717e424bf5b0bb80e"

S = "${WORKDIR}/${SRCNAME}-${PV}"

inherit setuptools
