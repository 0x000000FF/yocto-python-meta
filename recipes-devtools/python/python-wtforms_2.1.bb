DESCRIPTION = "A flexible forms validation and rendering library for python web development."
HOMEPAGE = "https://pypi.python.org/pypi/WTForms"
SECTION = "devel/python"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d41d8cd98f00b204e9800998ecf8427e"

PR = "r0"
SRCNAME = "WTForms"

SRC_URI = "https://pypi.python.org/packages/source/W/${SRCNAME}/${SRCNAME}-${PV}.zip"

SRC_URI[md5sum] = "6938a541fafd1a1ae2f6b9b88588eef2"
SRC_URI[sha256sum] = "ffdf10bd1fa565b8233380cb77a304cd36fd55c73023e91d4b803c96bc11d46f"

S = "${WORKDIR}/${SRCNAME}-${PV}"

inherit setuptools
