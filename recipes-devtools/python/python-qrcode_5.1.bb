

DESCRIPTION = "QR Code image generator."
SECTION = "devel/python"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4b802d2a65df4626623c79757f486af9"

PR = "r0"
SRCNAME = "qrcode"

SRC_URI = "https://pypi.python.org/packages/source/q/${SRCNAME}/${SRCNAME}-${PV}.tar.gz"

SRC_URI[md5sum] = "1f20223419bbf992208ada0c12ed4577"
SRC_URI[sha256sum] = "33bdee5e834fc99eb538e1dad198a3a5b70d0a88845629cacf4c592be1ce7f6a"

S = "${WORKDIR}/${SRCNAME}-${PV}"

inherit setuptools

RDEPENDS_${PN} += "python-pickle python-crypt"
