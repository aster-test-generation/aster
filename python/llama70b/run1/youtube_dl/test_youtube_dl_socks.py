import unittest
from youtube_dl.socks import *


class TestSocks4Command(unittest.TestCase):
    def test_CMD_CONNECT(self):
        self.assertEqual(Socks4Command.CMD_CONNECT, 0x01)

    def test_CMD_BIND(self):
        self.assertEqual(Socks4Command.CMD_BIND, 0x02)

class TestSocks5Command(unittest.TestCase):
    def test_CMD_CONNECT(self):
        self.assertEqual(Socks5Command.CMD_CONNECT, 0x01)

    def test_CMD_BIND(self):
        self.assertEqual(Socks5Command.CMD_BIND, 0x02)

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
        self.assertEqual(ProxyError.ERR_SUCCESS, 0x00)

class TestInvalidVersionError(unittest.TestCase):
    def test_init(self):
        error = InvalidVersionError(0x01, 0x02)
        self.assertEqual(str(error), 'Invalid response version from server. Expected 01 got 02')

class TestSocks4Error(unittest.TestCase):
    def test_ERR_SUCCESS(self):
        self.assertEqual(Socks4Error.ERR_SUCCESS, 90)

    def test_CODES(self):
        self.assertEqual(Socks4Error.CODES, {
            91: 'request rejected or failed',
            92: 'request rejected because SOCKS server cannot connect to identd on the client',
            93: 'request rejected because the client program and identd report different user-ids'
        })

class TestSocks5Error(unittest.TestCase):
    def test_ERR_GENERAL_FAILURE(self):
        self.assertEqual(Socks5Error.ERR_GENERAL_FAILURE, 0x01)

    def test_CODES(self):
        self.assertEqual(Socks5Error.CODES, {
            0x01: 'general SOCKS server failure',
            0x02: 'connection not allowed by ruleset',
            0x03: 'Network unreachable',
            0x04: 'Host unreachable',
            0x05: 'Connection refused',
            0x06: 'TTL expired',
            0x07: 'Command not supported',
            0x08: 'Address type not supported',
            0xFE: 'unknown username or invalid password',
            0xFF: 'all offered authentication methods were rejected'
        })

class TestProxyType(unittest.TestCase):
    def test_SOCKS4(self):
        self.assertEqual(ProxyType.SOCKS4, 0)

    def test_SOCKS4A(self):
        self.assertEqual(ProxyType.SOCKS4A, 1)

    def test_SOCKS5(self):
        self.assertEqual(ProxyType.SOCKS5, 2)

class TestProxy(unittest.TestCase):
    def test_init(self):
        proxy = Proxy(ProxyType.SOCKS4, 'host', 8080, 'username', 'password', True)
        self.assertEqual(proxy.type, ProxyType.SOCKS4)
        self.assertEqual(proxy.host, 'host')
        self.assertEqual(proxy.port, 8080)
        self.assertEqual(proxy.username, 'username')
        self.assertEqual(proxy.password, 'password')
        self.assertEqual(proxy.remote_dns, True)

class TestSocksSocket(unittest.TestCase):
    def test_init(self):
        sock = sockssocket()
        self.assertIsNone(sock._proxy)

    def test_setproxy(self):
        sock = sockssocket()
        sock.setproxy(ProxyType.SOCKS4, 'host', 8080, True, 'username', 'password')
        self.assertIsNotNone(sock._proxy)

    def test_recvall(self):
        sock = sockssocket()
        sock.recv = lambda x: b'hello'
        self.assertEqual(sock.recvall(5), b'hello')

if __name__ == '__main__':
    unittest.main()