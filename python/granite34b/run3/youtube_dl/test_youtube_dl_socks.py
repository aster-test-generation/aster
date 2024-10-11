import unittest
from youtube_dl.socks import *


class TestSocks(unittest.TestCase):
    def test_socks4_command(self):
        self.assertEqual(Socks4Command.CMD_CONNECT, 0x01)
        self.assertEqual(Socks4Command.CMD_BIND, 0x02)

    def test_socks5_command(self):
        self.assertEqual(Socks5Command.CMD_UDP_ASSOCIATE, 0x03)

    def test_socks5_auth(self):
        self.assertEqual(Socks5Auth.AUTH_NONE, 0x00)
        self.assertEqual(Socks5Auth.AUTH_GSSAPI, 0x01)
        self.assertEqual(Socks5Auth.AUTH_USER_PASS, 0x02)
        self.assertEqual(Socks5Auth.AUTH_NO_ACCEPTABLE, 0xFF)

    def test_socks5_address_type(self):
        self.assertEqual(Socks5AddressType.ATYP_IPV4, 0x01)
        self.assertEqual(Socks5AddressType.ATYP_DOMAINNAME, 0x03)
        self.assertEqual(Socks5AddressType.ATYP_IPV6, 0x04)

    def test_proxy_error(self):
        self.assertEqual(ProxyError.ERR_SUCCESS, 0x00)

    def test_invalid_version_error(self):
        expected_version = 0x01
        got_version = 0x02
        error = InvalidVersionError(expected_version, got_version)
        self.assertEqual(error.args[0], 0)
        self.assertEqual(error.args[1], 'Invalid response version from server. Expected {0:02x} got {1:02x}'.format(expected_version, got_version))

    def test_socks4_error(self):
        self.assertEqual(Socks4Error.ERR_SUCCESS, 90)
        self.assertEqual(Socks4Error.CODES[91], 'request rejected or failed')
        self.assertEqual(Socks4Error.CODES[92], 'request rejected because SOCKS server cannot connect to identd on the client')
        self.assertEqual(Socks4Error.CODES[93], 'request rejected because the client program and identd report different user-ids')

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

    def test_proxy_type(self):
        self.assertEqual(ProxyType.SOCKS4, 0)
        self.assertEqual(ProxyType.SOCKS4A, 1)
        self.assertEqual(ProxyType.SOCKS5, 2)

    def test_proxy(self):
        proxy = Proxy(ProxyType.SOCKS4, 'host', 1234, 'username', 'password', True)
        self.assertEqual(proxy.type, ProxyType.SOCKS4)
        self.assertEqual(proxy.host, 'host')
        self.assertEqual(proxy.port, 1234)
        self.assertEqual(proxy.username, 'username')
        self.assertEqual(proxy.password, 'password')
        self.assertEqual(proxy.remote_dns, True)

if __name__ == '__main__':
    unittest.main()