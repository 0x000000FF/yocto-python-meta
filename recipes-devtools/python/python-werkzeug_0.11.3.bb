DESCRIPTION = "The Swiss Army knife of Python web development"
HOMEPAGE = "https://pypi.python.org/pypi/Flask"
SECTION = "devel/python"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a68f5361a2b2ca9fdf26b38aaecb6faa"

PR = "r0"
SRCNAME = "Werkzeug"

SRC_URI = "https://pypi.python.org/packages/source/W/${SRCNAME}/${SRCNAME}-${PV}.tar.gz"

SRC_URI[md5sum] = "6938a541fafd1a1ae2f6b9b88588eef2"
SRC_URI[sha256sum] = "ffdf10bd1fa565b8233380cb77a304cd36fd55c73023e91d4b803c96bc11d46f"

S = "${WORKDIR}/${SRCNAME}-${PV}"

inherit setuptools

