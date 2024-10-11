import unittest
from ansible.module_utils.facts.hardware.openbsd import OpenBSDHardware, OpenBSDHardwareCollector


class TestOpenBSDHardware(unittest.TestCase):
    def test_populate(self):
        hardware = OpenBSDHardware(module=None)
        hardware.sysctl = {'hw': {'ncpuonline': 2, 'model': 'Intel Core i7', 'usermem': 16777216, 'disknames': 'da0, da1'}}
        hardware_facts = hardware.populate()
        self.assertEqual(hardware_facts['processor'], ['Intel Core i7', 'Intel Core i7'])
        self.assertEqual(hardware_facts['processor_count'], 2)
        self.assertEqual(hardware_facts['processor_cores'], 2)
        self.assertEqual(hardware_facts['memfree_mb'], 16384)
        self.assertEqual(hardware_facts['memtotal_mb'], 16384)
        self.assertEqual(hardware_facts['swapfree_mb'], 0)
        self.assertEqual(hardware_facts['swaptotal_mb'], 0)
        self.assertEqual(hardware_facts['devices'], ['da0', 'da1'])

    def test_get_mount_facts(self):
        hardware = OpenBSDHardware(module=None)
        fstab = """/dev/ada0p3 / ext3 rw,noatime,errors=remount-ro 1 1
/dev/ada1p3 none swap sw,pri=5 0 0
/dev/ada0p2 /home ext3 rw,noatime 1 2"""
        hardware.get_file_content = lambda path: fstab if path == '/etc/fstab' else None
        mount_facts = hardware.get_mount_facts()
        self.assertEqual(mount_facts['mounts'], [{'mount': '/', 'device': '/dev/ada0p3', 'fstype': 'ext3', 'options': 'rw,noatime,errors=remount-ro', 'size_total': None, 'size_available': None, 'percent_available': None}, {'mount': '/home', 'device': '/dev/ada0p2', 'fstype': 'ext3', 'options': 'rw,noatime', 'size_total': None, 'size_available': None, 'percent_available': None}])

    def test_get_memory_facts(self):
        hardware = OpenBSDHardware(module=None)
        vmstat = """ 42435 pages paged in
13587 pages paged out
12706 pages freed
13755 pages active
3276 pages inactive
13755 pages total"""
        hardware.module.run_command = lambda cmd: (0, vmstat, '') if cmd == '/usr/bin/vmstat' else (0, '', '')
        memory_facts = hardware.get_memory_facts()
        self.assertEqual(memory_facts['memfree_mb'], 3276)
        self.assertEqual(memory_facts['memtotal_mb'], 16384)
        swapctl = """total: 16384M
used: 0M
free: 16384M"""
        hardware.module.run_command = lambda cmd: (0, swapctl, '') if cmd == '/sbin/swapctl -sk' else (0, '', '')
        memory_facts = hardware.get_memory_facts()
        self.assertEqual(memory_facts['swapfree_mb'], 16384)
        self.assertEqual(memory_facts['swaptotal_mb'], 16384)

    def test_get_uptime_facts(self):
        hardware = OpenBSDHardware(module=None)
        sysctl = """kern.boottime: 1638432768"""
        hardware.module.run_command = lambda cmd: (0, sysctl, '') if cmd == ['sysctl', '-n', 'kern.boottime'] else (0, '', '')
        uptime_facts = hardware.get_uptime_facts()
        self.assertEqual(uptime_facts['uptime_seconds'], 16384)

if __name__ == '__main__':
    unittest.main()