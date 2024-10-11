
import unittest
from youtube_dl.socks import *

class TestSocks4Command(unittest.TestCase):
    def test_CMD_CONNECT(self):
        self.assertEqual(Socks4Command.CMD_CONNECT, 0x01)

    def test_CMD_BIND(self):
        self.assertEqual(Socks4Command.CMD_BIND, 0x02)

class TestSocks5Command(unittest.TestCase):
    def test_CMD_UDP_ASSOCIATE(self):
        self.assertEqual(Socks5Command.CMD_UDP_ASSOCIATE, 0x03)

class TestSocks5Auth(unittest.TestCase):
    def test_AUTH_NONE(self):
        self.assertEqual(Socks5Auth.AUTH_NONE, 0x00)

    def test_AUTH_GSSAPI(self):
        self.assertEqual(Socks5Auth.AUTH_GSSAPI, 0x01)

    def test_AUTH_USER_PASS(self):
        self.assertEqual(Socks5Auth.AUTH_USER_PASS, 0x02)

    def test_AUTH_NO_ACCEPTABLE(self):
        self.assertEqual(Socks5Auth.AUTH_NO_ACCEPTABLE, 0xFF)

class TestSocks5AddressType(unittest.TestCase):
    def test_ATYP_IPV4(self):
        self.assertEqual(Socks5AddressType.ATYP_IPV4, 0x01)

    def test_ATYP_DOMAINNAME(self):
        self.assertEqual(Socks5AddressType.ATYP_DOMAINNAME, 0x03)

    def test_ATYP_IPV6(self):
        self.assertEqual(Socks5AddressType.ATYP_IPV6, 0x04)

class TestProxyError(unittest.TestCase):
    def test_ERR_SUCCESS(self):
        self.assertEqual(ProxyError.ERR_SUCCESS, 0)

    def test___init__(self):
        self.assertEqual(ProxyError(0, 'unknown error'), ProxyError(0, 'unknown error'))

class TestInvalidVersionError(unittest.TestCase):
    def test___init__(self):
        self.assertEqual(InvalidVersionError(0x00, 0x00), InvalidVersionError(0x00, 0x00))

class TestSocks4Error(unittest.TestCase):
    def test_ERR_SUCCESS(self):
        self.assertEqual(Socks4Error.ERR_SUCCESS, 90)

    def test_CODES(self):
        self.assertEqual(Socks4Error.CODES, {
            91: 'request rejected or failed',
            92: 'request rejected because SOCKS server cannot connect to identd on the client',
            93: 'request rejected because the client program and identd report different user-ids'
        })

    def test___init__(self):
        self.assertEqual(Socks4Error(90, 'request rejected or failed'), Socks4Error(90, 'request rejected or failed'))

class TestSocks5Error(unittest.TestCase):
    def test_ERR_GENERAL_FAILURE(self):
        self.assertEqual(Socks5Error.ERR_GENERAL_FAILURE, 0x01)

if __name__ == '__main__':
    unittest.main()