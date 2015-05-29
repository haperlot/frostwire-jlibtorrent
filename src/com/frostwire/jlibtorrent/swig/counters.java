/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class counters {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected counters(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(counters obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_counters(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public counters() {
    this(libtorrent_jni.new_counters__SWIG_0(), true);
  }

  public counters(counters arg0) {
    this(libtorrent_jni.new_counters__SWIG_1(counters.getCPtr(arg0), arg0), true);
  }

  public long inc_stats_counter(int c, long value) {
    return libtorrent_jni.counters_inc_stats_counter__SWIG_0(swigCPtr, this, c, value);
  }

  public long inc_stats_counter(int c) {
    return libtorrent_jni.counters_inc_stats_counter__SWIG_1(swigCPtr, this, c);
  }

  public long op_get_at(int i) {
    return libtorrent_jni.counters_op_get_at(swigCPtr, this, i);
  }

  public void set_value(int c, long value) {
    libtorrent_jni.counters_set_value(swigCPtr, this, c, value);
  }

  public void blend_stats_counter(int c, long value, int ratio) {
    libtorrent_jni.counters_blend_stats_counter(swigCPtr, this, c, value, ratio);
  }

  public enum stats_counter_t {
    error_peers,
    disconnected_peers,
    eof_peers,
    connreset_peers,
    connrefused_peers,
    connaborted_peers,
    notconnected_peers,
    perm_peers,
    buffer_peers,
    unreachable_peers,
    broken_pipe_peers,
    addrinuse_peers,
    no_access_peers,
    invalid_arg_peers,
    aborted_peers,
    piece_requests,
    max_piece_requests,
    invalid_piece_requests,
    choked_piece_requests,
    cancelled_piece_requests,
    piece_rejects,
    error_incoming_peers,
    error_outgoing_peers,
    error_rc4_peers,
    error_encrypted_peers,
    error_tcp_peers,
    error_utp_peers,
    reject_piece_picks,
    unchoke_piece_picks,
    incoming_redundant_piece_picks,
    incoming_piece_picks,
    end_game_piece_picks,
    snubbed_piece_picks,
    interesting_piece_picks,
    hash_fail_piece_picks,
    piece_picker_partial_loops,
    piece_picker_suggest_loops,
    piece_picker_sequential_loops,
    piece_picker_reverse_rare_loops,
    piece_picker_rare_loops,
    piece_picker_rand_start_loops,
    piece_picker_rand_loops,
    piece_picker_busy_loops,
    connect_timeouts,
    uninteresting_peers,
    timeout_peers,
    no_memory_peers,
    too_many_peers,
    transport_timeout_peers,
    num_banned_peers,
    banned_for_hash_failure,
    connection_attempts,
    connection_attempt_loops,
    incoming_connections,
    on_read_counter,
    on_write_counter,
    on_tick_counter,
    on_lsd_counter,
    on_lsd_peer_counter,
    on_udp_counter,
    on_accept_counter,
    on_disk_queue_counter,
    on_disk_counter,
    torrent_evicted_counter,
    num_incoming_choke,
    num_incoming_unchoke,
    num_incoming_interested,
    num_incoming_not_interested,
    num_incoming_have,
    num_incoming_bitfield,
    num_incoming_request,
    num_incoming_piece,
    num_incoming_cancel,
    num_incoming_dht_port,
    num_incoming_suggest,
    num_incoming_have_all,
    num_incoming_have_none,
    num_incoming_reject,
    num_incoming_allowed_fast,
    num_incoming_ext_handshake,
    num_incoming_pex,
    num_incoming_metadata,
    num_incoming_extended,
    num_outgoing_choke,
    num_outgoing_unchoke,
    num_outgoing_interested,
    num_outgoing_not_interested,
    num_outgoing_have,
    num_outgoing_bitfield,
    num_outgoing_request,
    num_outgoing_piece,
    num_outgoing_cancel,
    num_outgoing_dht_port,
    num_outgoing_suggest,
    num_outgoing_have_all,
    num_outgoing_have_none,
    num_outgoing_reject,
    num_outgoing_allowed_fast,
    num_outgoing_ext_handshake,
    num_outgoing_pex,
    num_outgoing_metadata,
    num_outgoing_extended,
    num_piece_passed,
    num_piece_failed,
    num_have_pieces,
    num_total_pieces_added,
    num_blocks_written,
    num_blocks_read,
    num_blocks_hashed,
    num_blocks_cache_hits,
    num_write_ops,
    num_read_ops,
    num_read_back,
    disk_read_time,
    disk_write_time,
    disk_hash_time,
    disk_job_time,
    waste_piece_timed_out,
    waste_piece_cancelled,
    waste_piece_unknown,
    waste_piece_seed,
    waste_piece_end_game,
    waste_piece_closing,
    sent_payload_bytes,
    sent_bytes,
    sent_ip_overhead_bytes,
    sent_tracker_bytes,
    recv_payload_bytes,
    recv_bytes,
    recv_ip_overhead_bytes,
    recv_tracker_bytes,
    recv_failed_bytes,
    recv_redundant_bytes,
    dht_messages_in,
    dht_messages_out,
    dht_messages_out_dropped,
    dht_bytes_in,
    dht_bytes_out,
    dht_ping_in,
    dht_ping_out,
    dht_find_node_in,
    dht_find_node_out,
    dht_get_peers_in,
    dht_get_peers_out,
    dht_announce_peer_in,
    dht_announce_peer_out,
    dht_get_in,
    dht_get_out,
    dht_put_in,
    dht_put_out,
    dht_invalid_announce,
    dht_invalid_get_peers,
    dht_invalid_put,
    dht_invalid_get,
    utp_packet_loss,
    utp_timeout,
    utp_packets_in,
    utp_packets_out,
    utp_fast_retransmit,
    utp_packet_resend,
    utp_samples_above_target,
    utp_samples_below_target,
    utp_payload_pkts_in,
    utp_payload_pkts_out,
    utp_invalid_pkts_in,
    utp_redundant_pkts_in,
    socket_send_size3,
    socket_send_size4,
    socket_send_size5,
    socket_send_size6,
    socket_send_size7,
    socket_send_size8,
    socket_send_size9,
    socket_send_size10,
    socket_send_size11,
    socket_send_size12,
    socket_send_size13,
    socket_send_size14,
    socket_send_size15,
    socket_send_size16,
    socket_send_size17,
    socket_send_size18,
    socket_send_size19,
    socket_send_size20,
    socket_recv_size3,
    socket_recv_size4,
    socket_recv_size5,
    socket_recv_size6,
    socket_recv_size7,
    socket_recv_size8,
    socket_recv_size9,
    socket_recv_size10,
    socket_recv_size11,
    socket_recv_size12,
    socket_recv_size13,
    socket_recv_size14,
    socket_recv_size15,
    socket_recv_size16,
    socket_recv_size17,
    socket_recv_size18,
    socket_recv_size19,
    socket_recv_size20,
    num_stats_counters;

    public final int swigValue() {
      return swigValue;
    }

    public static stats_counter_t swigToEnum(int swigValue) {
      stats_counter_t[] swigValues = stats_counter_t.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (stats_counter_t swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + stats_counter_t.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private stats_counter_t() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private stats_counter_t(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private stats_counter_t(stats_counter_t swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

  public enum stats_gauge_t {
    num_checking_torrents(libtorrent_jni.counters_num_checking_torrents_get()),
    num_stopped_torrents,
    num_upload_only_torrents,
    num_downloading_torrents,
    num_seeding_torrents,
    num_queued_seeding_torrents,
    num_queued_download_torrents,
    num_error_torrents,
    non_filter_torrents,
    num_loaded_torrents,
    num_pinned_torrents,
    num_tcp_peers,
    num_socks5_peers,
    num_http_proxy_peers,
    num_utp_peers,
    num_i2p_peers,
    num_ssl_peers,
    num_ssl_socks5_peers,
    num_ssl_http_proxy_peers,
    num_ssl_utp_peers,
    num_peers_half_open,
    num_peers_connected,
    num_peers_up_interested,
    num_peers_down_interested,
    num_peers_up_unchoked_all,
    num_peers_up_unchoked_optimistic,
    num_peers_up_unchoked,
    num_peers_down_unchoked,
    num_peers_up_requests,
    num_peers_down_requests,
    num_peers_up_disk,
    num_peers_down_disk,
    num_peers_end_game,
    write_cache_blocks,
    read_cache_blocks,
    request_latency,
    pinned_blocks,
    disk_blocks_in_use,
    queued_disk_jobs,
    num_running_disk_jobs,
    num_read_jobs,
    num_write_jobs,
    num_jobs,
    num_writing_threads,
    num_running_threads,
    blocked_disk_jobs,
    queued_write_bytes,
    num_unchoke_slots,
    num_fenced_read,
    num_fenced_write,
    num_fenced_hash,
    num_fenced_move_storage,
    num_fenced_release_files,
    num_fenced_delete_files,
    num_fenced_check_fastresume,
    num_fenced_save_resume_data,
    num_fenced_rename_file,
    num_fenced_stop_torrent,
    num_fenced_cache_piece,
    num_fenced_flush_piece,
    num_fenced_flush_hashed,
    num_fenced_flush_storage,
    num_fenced_trim_cache,
    num_fenced_file_priority,
    num_fenced_load_torrent,
    num_fenced_clear_piece,
    num_fenced_tick_storage,
    arc_mru_size,
    arc_mru_ghost_size,
    arc_mfu_size,
    arc_mfu_ghost_size,
    arc_write_size,
    arc_volatile_size,
    dht_nodes,
    dht_node_cache,
    dht_torrents,
    dht_peers,
    dht_immutable_data,
    dht_mutable_data,
    dht_allocated_observers,
    has_incoming_connections,
    limiter_up_queue,
    limiter_down_queue,
    limiter_up_bytes,
    limiter_down_bytes,
    num_utp_idle,
    num_utp_syn_sent,
    num_utp_connected,
    num_utp_fin_sent,
    num_utp_close_wait,
    num_utp_deleted,
    num_counters,
    num_gauges_counters(libtorrent_jni.counters_num_gauges_counters_get());

    public final int swigValue() {
      return swigValue;
    }

    public static stats_gauge_t swigToEnum(int swigValue) {
      stats_gauge_t[] swigValues = stats_gauge_t.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (stats_gauge_t swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + stats_gauge_t.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private stats_gauge_t() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private stats_gauge_t(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private stats_gauge_t(stats_gauge_t swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

}