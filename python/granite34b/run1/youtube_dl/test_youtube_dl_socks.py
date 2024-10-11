import unittest
from youtube_dl.socks import *
from youtube_dl.socks import (
    Socks4Command,
    Socks5Command,
    Socks5Auth,
    Socks5AddressType,
    ProxyError,
    InvalidVersionError,
    Socks4Error,
    Socks5Error,
    ProxyType,
    sockssocket,
)


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
        expected_version = 0x01
        got_version = 0x02
        with self.assertRaises(InvalidVersionError) as cm:
            raise InvalidVersionError(expected_version, got_version)
        self.assertEqual(str(cm.exception), 'Invalid response version from server. Expected 01 got 02')

class TestSocks4Error(unittest.TestCase):
    def test_socks4_error(self):
        self.assertEqual(Socks4Error.ERR_SUCCESS, 90)
        self.assertEqual(Socks4Error.CODES[91], 'request rejected or failed')
        self.assertEqual(Socks4Error.CODES[92], 'request rejected because SOCKS server cannot connect to identd on the client')
        self.assertEqual(Socks4Error.CODES[93], 'request rejected because the client program and identd report different user-ids')

class TestSocks5Error(unittest.TestCase):
    def test_socks5_error(self):
        self.assertEqual(Socks5Error.ERR_GENERAL_FAILURE, 0x01)
        self.assertEqual(Socks5Error.CODES[0x01], 'general SOCKS server failure')
        self.assertEqual(Socks5Error.CODES[0x02], 'connection not allowed by ruleset')
        self.assertEqual(Socks5Error.CODES[0x03], 'Network unreachable')
        self.assertEqual(Socks5Error.CODES[0x04], 'Host unreachable')
        self.assertEqual(Socks5Error.CODES[0x05], 'Connection refused')
        self.assertEqual(Socks5Error.CODES[0x06], 'TTL expired')
        self.assertEqual(Socks5Error.CODES[0x07], 'Command not supported')
        self.assertEqual(Socks5Error.CODES[0x08], 'Address type not supported')
        self.assertEqual(Socks5Error.CODES[0xFE], 'unknown username or invalid password')
        self.assertEqual(Socks5Error.CODES[0xFF], 'all offered authentication methods were rejected')

class TestProxyType(unittest.TestCase):
    def test_proxy_type(self):
        self.assertEqual(ProxyType.SOCKS4, 0)
        self.assertEqual(ProxyType.SOCKS4A, 1)
        self.assertEqual(ProxyType.SOCKS5, 2)


class TestSocks4Command(unittest.TestCase):
    def test_socks4_command_values(self):
        self.assertEqual(Socks4Command.CMD_CONNECT, 0x01)
        self.assertEqual(Socks4Command.CMD_BIND, 0x02)

class TestSocks5Command(unittest.TestCase):
    def test_socks5_command_values(self):
        self.assertEqual(Socks5Command.CMD_CONNECT, 0x01)
        self.assertEqual(Socks5Command.CMD_BIND, 0x02)
        self.assertEqual(Socks5Command.CMD_UDP_ASSOCIATE, 0x03)

class TestSocks5Auth(unittest.TestCase):
    def test_socks5_auth_values(self):
        self.assertEqual(Socks5Auth.AUTH_NONE, 0x00)
        self.assertEqual(Socks5Auth.AUTH_GSSAPI, 0x01)
        self.assertEqual(Socks5Auth.AUTH_USER_PASS, 0x02)
        self.assertEqual(Socks5Auth.AUTH_NO_ACCEPTABLE, 0xFF)

class TestSocks5AddressType(unittest.TestCase):
    def test_socks5_address_type_values(self):
        self.assertEqual(Socks5AddressType.ATYP_IPV4, 0x01)
        self.assertEqual(Socks5AddressType.ATYP_DOMAINNAME, 0x03)
        self.assertEqual(Socks5AddressType.ATYP_IPV6, 0x04)

class TestProxyError(unittest.TestCase):
    def test_proxy_error_init(self):
        error = ProxyError(1, "error message")
        self.assertEqual(error.args[0], 1)
        self.assertEqual(error.args[1], "error message")

class TestInvalidVersionError(unittest.TestCase):
    def test_invalid_version_error_init(self):
        error = InvalidVersionError(0x01, 0x02)
        self.assertEqual(error.args[0], 0)
        self.assertEqual(error.args[1], "Invalid response version from server. Expected 01 got 02")

class TestSocks4Error(unittest.TestCase):
    def test_socks4_error_init(self):
        error = Socks4Error(1, "error message")
        self.assertEqual(error.args[0], 1)
        self.assertEqual(error.args[1], "error message")

class TestSocks5Error(unittest.TestCase):
    def test_socks5_error_init(self):
        error = Socks5Error(1, "error message")
        self.assertEqual(error.args[0], 1)
        self.assertEqual(error.args[1], "error message")

class TestProxyType(unittest.TestCase):
    def test_proxy_type_values(self):
        self.assertEqual(ProxyType.SOCKS4, 0)
        self.assertEqual(ProxyType.SOCKS4A, 1)
        self.assertEqual(ProxyType.SOCKS5, 2)

class TestSocksSocket(unittest.TestCase):
    def test_setproxy(self):
        socket = sockssocket()
        socket.setproxy(ProxyType.SOCKS4, "127.0.0.1", 1080)
        self.assertEqual(socket._proxy.type, ProxyType.SOCKS4)
        self.assertEqual(socket._proxy.host, "127.0.0.1")
        self.assertEqual(socket._proxy.port, 1080)
        self.assertEqual(socket._proxy.username, None)
        self.assertEqual(socket._proxy.password, None)
        self.assertEqual(socket._proxy.remote_dns, True)

    def test_recvall(self):
        socket = sockssocket()
        socket.recv = lambda cnt: b"1234"
        self.assertEqual(socket.recvall(4), b"1234")

if __name__ == '__main__':
    unittest.main()