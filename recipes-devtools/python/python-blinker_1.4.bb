DESCRIPTION = "Fast, simple object-to-object and broadcast signaling."
HOMEPAGE = "https://pypi.python.org/pypi/blinker"
SECTION = "devel/python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8baf1d53a00de619f60052e4752a89af"

PR = "r0"
SRCNAME = "blinker"

SRC_URI = "https://pypi.python.org/packages/source/b/${SRCNAME}/${SRCNAME}-${PV}.tar.gz"

SRC_URI[md5sum] = "8b3722381f83c2813c52de3016b68d33"
SRC_URI[sha256sum] = "471aee25f3992bd325afa3772f1063dbdbbca947a041b8b89466dc00d606f8b6"

S = "${WORKDIR}/${SRCNAME}-${PV}"

inherit setuptools

