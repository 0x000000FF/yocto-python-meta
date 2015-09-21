DESCRIPTION = "A built-package format for Python."
HOMEPAGE = "https://pypi.python.org/pypi/wheel"
SECTION = "devel/python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9d66b41bc2a080e7174acc5dffecd752"

PR = "r0"
SRCNAME = "wheel"

SRC_URI = "https://pypi.python.org/packages/source/w/${SRCNAME}/${SRCNAME}-${PV}.tar.gz"

SRC_URI[md5sum] = "3b0d66f0d127ea8befaa5d11453107fd"
SRC_URI[sha256sum] = "ef832abfedea7ed86b6eae7400128f88053a1da81a37c00613b1279544d585aa"

S = "${WORKDIR}/${SRCNAME}-${PV}"

inherit setuptools

