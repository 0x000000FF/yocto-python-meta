DESCRIPTION = "Dominate is a Python library for creating and manipulating HTML documents using an elegant DOM API."
HOMEPAGE = "https://pypi.python.org/pypi/Flask"
SECTION = "devel/python"
LICENSE = "LGPLv3"
LIC_FILES_CHKSUM = "file://PKG-INFO;md5=abc6a7f2b506eba48ce148496e5fae38"

PR = "r0"
SRCNAME = "dominate"

SRC_URI = "https://pypi.python.org/packages/source/d/${SRCNAME}/${SRCNAME}-${PV}.tar.gz"

SRC_URI[md5sum] = "af77ace88dc32cedb3989412528ae635"
SRC_URI[sha256sum] = "f961d8f8e585ad17257b0d54005856bf7a2a4051bbb0d8eff635a849efd8560a"

S = "${WORKDIR}/${SRCNAME}-${PV}"

inherit setuptools

