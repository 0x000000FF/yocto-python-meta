DESCRIPTION = "Flask extension for sending email"
HOMEPAGE = "https://pypi.python.org/pypi/Flask-Mail"
SECTION = "devel/python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5b16dfa6d3f275ace5985bb92949f770"

PR = "r0"
SRCNAME = "Flask-Mail"

SRC_URI = "https://pypi.python.org/packages/source/F/${SRCNAME}/${SRCNAME}-${PV}.tar.gz"

SRC_URI[md5sum] = "04b35a42a44ec7aa724ec8ce55e2e08e"
SRC_URI[sha256sum] = "22e5eb9a940bf407bcf30410ecc3708f3c56cc44b29c34e1726fe85006935f41"

S = "${WORKDIR}/${SRCNAME}-${PV}"

inherit setuptools

