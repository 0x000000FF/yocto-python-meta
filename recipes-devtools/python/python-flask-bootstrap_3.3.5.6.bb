DESCRIPTION = "An extension that includes Bootstrap in your project, without any boilerplate code."
HOMEPAGE = "https://pypi.python.org/pypi/Flask"
SECTION = "devel/python"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d41d8cd98f00b204e9800998ecf8427e"

PR = "r0"
SRCNAME = "Flask-Bootstrap"

SRC_URI = "https://pypi.python.org/packages/source/F/${SRCNAME}/${SRCNAME}-${PV}.tar.gz"

SRC_URI[md5sum] = "8527aaefa724a30eef7578a3139bbdef"
SRC_URI[sha256sum] = "3ae5cb10eb9fac01d2f9e107aeddab9b1475a6ed05ab53a59ed811a33d89bf7d"

S = "${WORKDIR}/${SRCNAME}-${PV}"

inherit setuptools
