"""
The RichLog class is a wrapper around the Python logging module that
provides additional features such as color formatting and markup support.
"""

import logging
from rich.logging import RichHandler

FORMAT = "%(message)s"
logging.basicConfig(
    level="INFO", format=FORMAT, datefmt="[%X]", handlers=[RichHandler(show_path=False)]
)


class RichLog:
    """Common Logger that uses Rich"""

    log = logging.getLogger("rich")

    @staticmethod
    def info(msg: str):
        """Log level INFO"""
        RichLog.log.info(msg, extra={"markup": True})

    @staticmethod
    def warn(msg: str):
        """Log level WARNING"""
        RichLog.log.warning(msg, extra={"markup": True})

    @staticmethod
    def debug(msg: str):
        """Log level DEBUG"""
        RichLog.log.debug(msg, extra={"markup": True})

    @staticmethod
    def error(msg: str):
        """Log level ERROR"""
        RichLog.log.error(msg, extra={"markup": True})

    @staticmethod
    def activate_debug():
        """Sets the logging level to DEBUG"""
        RichLog.log.setLevel(logging.DEBUG)