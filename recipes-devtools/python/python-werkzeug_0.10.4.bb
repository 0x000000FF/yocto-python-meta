DESCRIPTION = "The Swiss Army knife of Python web development"
HOMEPAGE = "https://pypi.python.org/pypi/Flask"
SECTION = "devel/python"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a68f5361a2b2ca9fdf26b38aaecb6faa"

PR = "r0"
SRCNAME = "Werkzeug"

SRC_URI = "https://pypi.python.org/packages/source/W/${SRCNAME}/${SRCNAME}-${PV}.tar.gz"

SRC_URI[md5sum] = "66a488e0ac50a9ec326fe020b3083450"
SRC_URI[sha256sum] = "9d2771e4c89be127bc4bac056ab7ceaf0e0064c723d6b6e195739c3af4fd5c1d"

S = "${WORKDIR}/${SRCNAME}-${PV}"

inherit setuptools
