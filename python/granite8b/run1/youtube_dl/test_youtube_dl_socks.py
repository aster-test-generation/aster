import unittest
from youtube_dl.socks import *


class TestSocks4Command(unittest.TestCase):
    def test_socks4_command(self):
        self.assertEqual(Socks4Command.CMD_CONNECT, 0x01)
        self.assertEqual(Socks4Command.CMD_BIND, 0x02)

class TestSocks5Command(unittest.TestCase):
    def test_socks5_command(self):
        self.assertEqual(Socks5Command.CMD_UDP_ASSOCIATE, 0x03)

class TestSocks5Auth(unittest.TestCase):
    def test_socks5_auth(self):
        self.assertEqual(Socks5Auth.AUTH_NONE, 0x00)
        self.assertEqual(Socks5Auth.AUTH_GSSAPI, 0x01)
        self.assertEqual(Socks5Auth.AUTH_USER_PASS, 0x02)
        self.assertEqual(Socks5Auth.AUTH_NO_ACCEPTABLE, 0xFF)

class TestSocks5AddressType(unittest.TestCase):
    def test_socks5_address_type(self):
        self.assertEqual(Socks5AddressType.ATYP_IPV4, 0x01)
        self.assertEqual(Socks5AddressType.ATYP_DOMAINNAME, 0x03)
        self.assertEqual(Socks5AddressType.ATYP_IPV6, 0x04)

class TestProxyError(unittest.TestCase):
    def test_proxy_error(self):
        self.assertEqual(ProxyError.ERR_SUCCESS, 0x00)

class TestInvalidVersionError(unittest.TestCase):
    def test_invalid_version_error(self):
        self.assertEqual(InvalidVersionError.ERR_SUCCESS, 0x00)

class TestSocks4Error(unittest.TestCase):
    def test_socks4_error(self):
        self.assertEqual(Socks4Error.ERR_SUCCESS, 90)

class TestSocks5Error(unittest.TestCase):
    def test_socks5_error(self):
        self.assertEqual(Socks5Error.ERR_GENERAL_FAILURE, 0x01)

class TestProxyType(unittest.TestCase):
    def test_proxy_type(self):
        self.assertEqual(ProxyType.SOCKS4, 0)
        self.assertEqual(ProxyType.SOCKS4A, 1)
        self.assertEqual(ProxyType.SOCKS5, 2)

class TestProxy(unittest.TestCase):
    def test_proxy(self):
        proxy = Proxy(ProxyType.SOCKS4, '127.0.0.1', 1080, 'username', 'password', True)
        self.assertEqual(proxy.type, ProxyType.SOCKS4)
        self.assertEqual(proxy.host, '127.0.0.1')
        self.assertEqual(proxy.port, 1080)
        self.assertEqual(proxy.username, 'username')
        self.assertEqual(proxy.password, 'password')
        self.assertEqual(proxy.remote_dns, True)

class TestSockssocket(unittest.TestCase):
    def test_sockssocket(self):
        sock = sockssocket()
        self.assertIsInstance(sock, socket.socket)

if __name__ == '__main__':
    unittest.main()